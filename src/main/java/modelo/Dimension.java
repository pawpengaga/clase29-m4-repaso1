package modelo;

public class Dimension {

  // Usamos los 3 ejes de la 3ra dimension
  private double ancho;
  private double alto;
  private double largo;

  public Dimension(double ancho, double alto, double largo) {
    super();
    this.ancho = ancho;
    this.alto = alto;
    this.largo = largo;
  }

  // Hacemos un metodo personalizado en vez de valernos de setter y getter
  public double getVolumen(){
    double v = alto * ancho * largo;
    return v;
  }

}
