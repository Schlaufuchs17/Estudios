import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videojuegos")
public class VideojuegoControlador {
    private final VideojuegoRepositorio repositorio = new VideojuegoRepositorio();

    @GetMapping
    public List<Videojuego> listarTodos() {
        return repositorio.listarTodos();
    }

    @GetMapping("/{id}")
    public Videojuego obtenerPorId(@PathVariable Long id) {
        return repositorio.buscarPorId(id).orElseThrow(() -> new RuntimeException("Videojuego no encontrado"));
    }

    @PostMapping
    public String agregar(@RequestBody Videojuego nuevo) {
        if (repositorio.existeIdONombre(nuevo.getId(), nuevo.getNombre())) {
            return "Error: ID o nombre ya existen.";
        }
        repositorio.agregar(nuevo);
        return "Videojuego agregado con éxito.";
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable Long id) {
        repositorio.eliminarPorId(id);
        return "Videojuego eliminado.";
    }

    @PutMapping("/{id}")
    public String actualizar(@PathVariable Long id, @RequestBody Videojuego actualizado) {
        repositorio.eliminarPorId(id);
        repositorio.agregar(actualizado);
        return "Videojuego actualizado.";
    }
}
