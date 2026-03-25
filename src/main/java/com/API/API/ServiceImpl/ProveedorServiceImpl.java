package com.API.API.ServiceImpl;

import com.API.API.Entitys.Proveedores;
import com.API.API.repository.ProveedorRepository;
import com.API.API.Service.ProveedorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorServiceImpl(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    @Override
    public List<Proveedores> listarTodos() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedores obtenerPorId(Long id) {
        return proveedorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proveedor no encontrado con id: " + id));
    }

    @Override
    public Proveedores guardar(Proveedores proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Proveedores actualizar(Long id, Proveedores proveedor) {
        Proveedores proveedorExistente = proveedorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proveedor no encontrado con id: " + id));

        proveedorExistente.setNombre(proveedor.getNombre());
        proveedorExistente.setTelefono(proveedor.getTelefono());
        proveedorExistente.setDireccion(proveedor.getDireccion());
        proveedorExistente.setEmail(proveedor.getEmail());

        return proveedorRepository.save(proveedorExistente);
    }

    @Override
    public void eliminar(Long id) {
        Proveedores proveedor = proveedorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proveedor no encontrado con id: " + id));

        proveedorRepository.delete(proveedor);
    }

    @Override
    public List<Proveedores> buscarPorNombre(String nombre) {
        return proveedorRepository.findByNombreContainingIgnoreCase(nombre);
    }
}