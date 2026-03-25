package com.API.API.repository;


import com.API.API.Entitys.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {

    List<Compra> findByFecha(LocalDate fecha);

    List<Compra> findByProveedoresId(Long proveedorId);

    List<Compra> findByEmpleadoId(Long empleadoId);
}