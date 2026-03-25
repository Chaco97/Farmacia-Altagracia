package com.API.API.repository;

import com.API.API.Entitys.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface VentaRepository extends JpaRepository<Venta, Long> {

    List<Venta> findByFecha(LocalDate fecha);

    List<Venta> findByClienteId(Long clienteId);

    List<Venta> findByEmpleadoId(Long empleadoId);
}