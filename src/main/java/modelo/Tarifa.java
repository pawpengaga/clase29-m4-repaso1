package modelo;

public class Tarifa {

  // Calculamos la tarifa con todos los datos del paquete
  public static double calcularTarifa(Paquete paquete){

    double tarifaBase = 3500.0F;
    double factorPeso = 500.0F; // Factor por quilo
    double factorDimension = 400.0F; // Factor por volumen

    double pesoCosto = paquete.getPeso() * (factorPeso / 100);
    double dimensionCosto = paquete.getDimension().getVolumen() * (factorDimension / 100);

    return tarifaBase + pesoCosto + dimensionCosto;

  }

}
