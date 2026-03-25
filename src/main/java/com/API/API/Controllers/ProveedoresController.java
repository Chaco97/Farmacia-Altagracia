package com.API.API.Controllers;


import com.API.API.Entitys.Proveedores;
import com.API.API.Service.ProveedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
@CrossOrigin(origins = "*")
public class ProveedoresController {

    private final ProveedorService proveedorService;

    public ProveedoresController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping
    public List<Proveedores> listarTodos() {
        return proveedorService.listarTodos();
    }

    @GetMapping("/{id}")
    public Proveedores obtenerPorId(@PathVariable Long id) {
        return proveedorService.obtenerPorId(id);
    }

    @GetMapping("/buscar")
    public List<Proveedores> buscarPorNombre(@RequestParam String nombre) {
        return proveedorService.buscarPorNombre(nombre);
    }

    @PostMapping
    public Proveedores guardar(@RequestBody Proveedores proveedor) {
        return proveedorService.guardar(proveedor);
    }

    @PutMapping("/{id}")
    public Proveedores actualizar(@PathVariable Long id, @RequestBody Proveedores proveedor) {
        return proveedorService.actualizar(id, proveedor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        proveedorService.eliminar(id);
    }
}
