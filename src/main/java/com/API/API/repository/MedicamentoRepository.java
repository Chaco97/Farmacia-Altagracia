package com.API.API.repository;


import com.API.API.Entitys.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long> {

    List<Medicamento> findByNombreContainingIgnoreCase(String nombre);

    List<Medicamento> findByStockLessThan(Integer stock);

    List<Medicamento> findByFechaVencimientoBefore(LocalDate fecha);

  List<Medicamento> findByProveedores_Id(Long proveedorId);
}