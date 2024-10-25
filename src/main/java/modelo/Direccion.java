package modelo;

public abstract class Direccion {

  // Hacemos la primera clase abstracta como direccion
  // Unificamos el concepto de direccion bajo este objeto, esta estandarizado

  private int numero; // Aniadido por mi
  private String calle;
  private String ciudad;
  private String codigoPostal;

  public Direccion(int numero, String calle, String ciudad, String codigoPostal) {
    super();
    this.numero = numero;
    this.calle = calle;
    this.ciudad = ciudad;
    this.codigoPostal = codigoPostal;
  }

  public int getNumero() {
    return numero;
  }

  public String getCalle() {
    return calle;
  }

  public String getCiudad() {
    return ciudad;
  }

  public String getCodigoPostal() {
    return codigoPostal;
  }

  


}
