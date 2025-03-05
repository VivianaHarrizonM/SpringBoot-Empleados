package vhm.empleados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vhm.empleados.model.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}