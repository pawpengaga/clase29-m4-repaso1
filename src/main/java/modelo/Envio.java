package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Envio {

  private Paquete paquete;
  private Cliente cliente;
  private LocalDate fechaEnvio;
  // private EstadoEnvio estado;
  private List<EstadoEnvio> estados;

  public Envio(Paquete paquete, Cliente cliente) {
    super();
    this.paquete = paquete;
    this.cliente = cliente;
    this.fechaEnvio = LocalDate.now();
    this.estados = new ArrayList<>();
    estados.add(EstadoEnvio.RECIBIDO_OFICINA);
  }

  // Creamos el metodo para cambiar el estado
  public void actualizarEstado(EstadoEnvio nuevoEstado){
    estados.add(nuevoEstado);
  }

  public LocalDate getFechaEnvio() {
    return fechaEnvio;
  }

  public List<EstadoEnvio> getEstado() {
    return estados;
  }
  
  // Getter para cliente y paquete
  
  public Paquete getPaquete() {
    return paquete;
  }

  public Cliente getCliente() {
    return cliente;
  }



}
