package modelo;

import java.time.LocalDate;

public class Envio {

  private Paquete paquete;
  private Cliente cliente;
  private LocalDate fechaEnvio;
  private EstadoEnvio estado;

  public Envio(Paquete paquete, Cliente cliente, LocalDate fechaEnvio, EstadoEnvio estado) {
    super();
    this.paquete = paquete;
    this.cliente = cliente;
    this.fechaEnvio = fechaEnvio;
    this.estado = estado;
  }

  // Creamos el metodo para cambiar el estado
  public void actualizarEstado(EstadoEnvio nuevoEstado){
    this.estado = nuevoEstado;
  }

  public LocalDate getFechaEnvio() {
    return fechaEnvio;
  }

  public EstadoEnvio getEstado() {
    return estado;
  }

}
