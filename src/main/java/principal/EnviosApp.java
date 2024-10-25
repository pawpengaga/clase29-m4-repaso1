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

  // Ahora quien realiza el envio
  public Envio realizarEnvio(Paquete paquete, Cliente cliente){
    Envio envio = new Envio(paquete, cliente);
    cliente.agregarEnvio(envio); // Nos aseguramos de que cada envio pertenezca a un cliente
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

  public void generarReporte(){
    System.out.println("Reporte de envios:");
    for (Envio e : envios) {
      System.out.printf("Cliente: %s, Paquete: %s, Fecha: %s, Estado: %s\n",
      e.getCliente().getNombre(), e.getPaquete().getIdPaquete(), e.getFechaEnvio(), e.getEstado());
    }
  }

  public static void main(String[] args) {

    System.out.println("--------------------------------------------------------------------\n");

    // Creamos direcciones
    Direccion origen = new DireccionConcreta(22, "Calle principal", "Arica", "1000000");
    Direccion destino = new DireccionConcreta(900, "Pasaje anonimo", "Alto Hospicio", "??????");

    // Aqui es donde va la ejecucion del programa
    EnviosApp envio1 = new EnviosApp();
    // Registramos un cliente

    // Almancenar esto en variables luego 💀
    envio1.realizarEnvio(envio1.crearPaquete("999", 5.5, new Dimension(30, 5, 10), origen, destino), envio1.registrarCliente("Erick Rivera", origen));
    
    double costo = envio1.calcularCostoEnvio(envio1.crearPaquete("999", 5.5, new Dimension(30, 5, 10), origen, destino));

    System.out.println("Costo del envio: $" + costo);
    envio1.actualizarEstadoEnvio(envio1.realizarEnvio(envio1.crearPaquete("999", 5.5, new Dimension(30, 5, 10), origen, destino), envio1.registrarCliente("Erick Rivera", origen)), EstadoEnvio.EN_TRANSITO);

    envio1.generarReporte();

  }
}
