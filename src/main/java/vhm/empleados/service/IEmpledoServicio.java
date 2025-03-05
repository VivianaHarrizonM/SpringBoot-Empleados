package vhm.empleados.service;

import vhm.empleados.model.Empleado;

import java.util.List;

public interface IEmpledoServicio {
  public List<Empleado> listarEmpleados();

  public Empleado buscarEmpleadoPorId(Integer idEmpleado);

  public void guardarEmpleado(Empleado empleado);

  public void eliminarEmpleado(Empleado empleado);
}

