package com.API.API.repository;

import com.API.API.Entitys.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProveedorRepository extends JpaRepository<Proveedores, Long> {

    List<Proveedores> findByNombreContainingIgnoreCase(String nombre);
}