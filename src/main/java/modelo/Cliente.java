package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

  private String nombre;
  private Direccion direccion;
  public List<Envio> envios; // clase pendiente


  public Cliente(String nombre, Direccion direccion) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.envios = new ArrayList<>();
  }

  // Metodos de trabajo con las listas
  public void agregarEnvio(Envio envio){
    envios.add(envio);
  }

  // Un getter para los nombres
  public String getNombre(){
    return this.nombre;
  }

  public List<Envio> getEnvios(){
    return this.envios;
  }


  @Override
  public String toString() {
    return "{" +
      " nombre='" + getNombre() + "'" +
      ", direccion='" + this.direccion + "'" +
      " }";
  }



}
