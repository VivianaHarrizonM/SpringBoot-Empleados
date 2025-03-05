package vhm.empleados.service;

import vhm.empleados.model.Empleado;
import vhm.empleados.repository.EmpleadoRepositorio;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmpleadoServicio implements IEmpledoServicio {

  private final EmpleadoRepositorio empleadoRepositorio;

  public EmpleadoServicio(EmpleadoRepositorio empleadoRepositorio) {
    this.empleadoRepositorio = empleadoRepositorio;
  }

  @Override
  public List<Empleado> listarEmpleados() {
    return empleadoRepositorio.findAll();
  }

  @Override
  public Empleado buscarEmpleadoPorId(Integer idEmpleado) {
    return empleadoRepositorio.findById(idEmpleado)
            .orElseThrow(() -> new NoSuchElementException("Empleado no encontrado con ID: " + idEmpleado));
  }

  @Override
  public void guardarEmpleado(Empleado empleado) {
    empleadoRepositorio.save(empleado);
  }

  @Override
  public void eliminarEmpleado(Empleado empleado) {
    empleadoRepositorio.delete(empleado);
  }
}