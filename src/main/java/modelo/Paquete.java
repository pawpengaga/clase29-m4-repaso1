package modelo;

public class Paquete {

  // Genericos propios
  private String idPaquete;
  private double peso;

  // Ajenos personalizados
  private Dimension dimension;
  private Direccion origen;
  private Direccion destino;


  public Paquete(String idPaquete, double peso, Dimension dimension, Direccion origen, Direccion destino) {
    super();
    this.idPaquete = idPaquete;
    this.peso = peso;
    this.dimension = dimension;
    this.origen = origen;
    this.destino = destino;
  }

  public String getIdPaquete() {
    return idPaquete;
  }

  public double getPeso() {
    return peso;
  }

  public Dimension getDimension() {
    return dimension;
  }

  public Direccion getOrigen() {
    return origen;
  }

  public Direccion getDestino() {
    return destino;
  }

  // Nos saltamos la creacion del toString
  


}
