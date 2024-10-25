package modelo;

import java.time.LocalDate;

public class Envio {

  private Paquete paquete;
  private Cliente cliente;
  private LocalDate fechaEnvio;
  private EstadoEnvio estado;

  public Envio(Paquete paquete, Cliente cliente) {
    super();
    this.paquete = paquete;
    this.cliente = cliente;
    this.fechaEnvio = LocalDate.now();
    this.estado = EstadoEnvio.RECIBIDO_OFICINA;
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
  
  // Getter para cliente y paquete
  
  public Paquete getPaquete() {
    return paquete;
  }

  public Cliente getCliente() {
    return cliente;
  }


}
