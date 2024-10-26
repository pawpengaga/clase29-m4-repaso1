package principal;

import modelo.Cliente;
import modelo.Dimension;
import modelo.Direccion;
import modelo.DireccionConcreta;
import modelo.Envio;
import modelo.EstadoEnvio;
import modelo.Paquete;
import modelo.Tarifa;

import java.util.ArrayList;
import java.util.List;

public class EnviosApp {

  private List<Cliente> clientes;
  private List<Paquete> paquetes;
  private List<Envio> envios;

  public EnviosApp(){
    clientes = new ArrayList<>();
    paquetes = new ArrayList<>();
    envios = new ArrayList<>();
  }

  public Cliente registrarCliente(String nombre, Direccion direccion){
    Cliente cliente = new Cliente(nombre, direccion);
    clientes.add(cliente);
    return cliente;
  }

  public Paquete crearPaquete(String id, double peso, Dimension dimension, Direccion origen, Direccion destino){
    Paquete paquete = new Paquete(id, peso, dimension, origen, destino);
    paquetes.add(paquete);
    return paquete;
  }

  // Crea el envio pero no hace nada con el
  public Envio crearEnvio(Paquete paquete, Cliente cliente){
    Envio envio = new Envio(paquete, cliente);
    cliente.agregarEnvio(envio); // Nos aseguramos de que cada envio pertenezca a un cliente
    return envio;
  }

  // Acto formal de enviar el envio declarado
  public Envio realizarEnvio(Envio envio){
    envios.add(envio);
    return envio;
  }

  public double calcularCostoEnvio(Paquete paquete){
    // Todo el calculo de la tarifa en un paso
    return Tarifa.calcularTarifa(paquete);
  }

  public void actualizarEstadoEnvio(Envio envio, EstadoEnvio nuevoEstado){
    envio.actualizarEstado(nuevoEstado);
  }

  public void generarReporte(Cliente cliente){
    System.out.println("Reporte de envios:");
    for (Envio e : cliente.getEnvios()) {
      System.out.printf("Cliente: %s, Paquete: %s, Fecha: %s, Estado: %s\n",
      e.getCliente().getNombre(), e.getPaquete().getIdPaquete(), e.getFechaEnvio(), e.getEstado());
    }
  }

  public void recorrerPrueba(){
    for (Cliente cliente : clientes) {
      System.out.println(cliente.envios);
    }
    for (Paquete paquete : paquetes) {
      System.out.println(paquete);
    }
  }

  public static void main(String[] args) {

    System.out.println("--------------------------------------------------------------------\n");

    EnviosApp envioApp = new EnviosApp();

    /************************************************************/

    // CREAR DATA PARA EL ENVIO
    Direccion origen = new DireccionConcreta(22, "Calle principal", "Arica", "1000000");
    Direccion destino = new DireccionConcreta(900, "Pasaje anonimo", "Alto Hospicio", "??????");

    Paquete paquete1 = envioApp.crearPaquete("999", 5.5, new Dimension(30, 5, 10), origen, destino);
    Cliente cliente1 = envioApp.registrarCliente("Erick Rivera", origen);
    Envio envio1 = envioApp.crearEnvio(paquete1, cliente1);
    envioApp.realizarEnvio(envio1);
    // Se registra el envio con la data por separado

    double costo = envioApp.calcularCostoEnvio(paquete1);
    System.out.println("Costo del envio: $" + costo);

    for (int i = 0; i < EstadoEnvio.values().length -1; i++) {
      envioApp.actualizarEstadoEnvio(envio1, EstadoEnvio.values()[i]);
    }

    envioApp.generarReporte(cliente1);
    
    // envioApp.recorrerPrueba();

  }
}
