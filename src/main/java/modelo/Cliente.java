package modelo;

import java.util.List;

public class Cliente {

  private String nombre;
  private Direccion direccion;
  private List<Envio> envios; // clase pendiente


  public Cliente(String nombre, Direccion direccion, List<Envio> envios) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.envios = envios;
  }

  // Metodos de trabajo con las listas
  public void agregarEnvio(Envio envio){
    envios.add(envio);
  }

  // Un getter para los nombres
  public String getNombre(){
    return this.nombre;
  }


}
