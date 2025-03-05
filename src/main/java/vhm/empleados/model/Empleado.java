package vhm.empleados.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empleado {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idEmpleado;
  private String nombreEmpleado;
  private String departamento;
  private Double sueldo;

  // Constructor sin parámetros
  public Empleado() {
  }

  // Constructor con parámetros
  public Empleado(Integer idEmpleado, String nombreEmpleado, String departamento, Double sueldo) {
    this.idEmpleado = idEmpleado;
    this.nombreEmpleado = nombreEmpleado;
    this.departamento = departamento;
    this.sueldo = sueldo;
  }

  // Getter y Setter para idEmpleado
  public Integer getIdEmpleado() {
    return idEmpleado;
  }

  public void setIdEmpleado(Integer idEmpleado) {
    this.idEmpleado = idEmpleado;
  }

  // Getter y Setter para nombreEmpleado
  public String getNombreEmpleado() {
    return nombreEmpleado;
  }

  public void setNombreEmpleado(String nombreEmpleado) {
    this.nombreEmpleado = nombreEmpleado;
  }

  // Getter y Setter para departamento
  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  // Getter y Setter para sueldo
  public Double getSueldo() {
    return sueldo;
  }

  public void setSueldo(Double sueldo) {
    this.sueldo = sueldo;
  }

  @Override
  public String toString() {
    return "Empleado{" +
            "idEmpleado=" + idEmpleado +
            ", nombreEmpleado='" + nombreEmpleado + '\'' +
            ", departamento='" + departamento + '\'' +
            ", sueldo=" + sueldo +
            '}';
  }
}
