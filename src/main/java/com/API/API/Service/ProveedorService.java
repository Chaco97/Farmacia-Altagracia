package com.API.API.Service;


import com.API.API.Entitys.Proveedores;

import java.util.List;

public interface ProveedorService {

    List<Proveedores> listarTodos();

    Proveedores obtenerPorId(Long id);

    Proveedores guardar(Proveedores proveedores);

    Proveedores actualizar(Long id, Proveedores proveedores);

    void eliminar(Long id);

    List<Proveedores> buscarPorNombre(String nombre);
}