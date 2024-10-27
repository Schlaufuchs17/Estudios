package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/videojuegos")
public class VideojuegoController {

    private Map<Integer, Videojuego> videojuegos = new HashMap<>();
    private int nextId = 1;

    public VideojuegoController() {
        // Inicialización con 5 videojuegos preestablecidos
        videojuegos.put(nextId++, new Videojuego(1, "The Last of Us", "Naughty Dog", 9.8f));
        videojuegos.put(nextId++, new Videojuego(2, "God of War", "Santa Monica Studio", 9.5f));
        videojuegos.put(nextId++, new Videojuego(3, "Horizon Zero Dawn", "Guerrilla Games", 9.0f));
        videojuegos.put(nextId++, new Videojuego(4, "Spider-Man", "Insomniac Games", 9.7f));
        videojuegos.put(nextId++, new Videojuego(5, "Sekiro: Shadows Die Twice", "FromSoftware", 9.6f));
    }

    @GetMapping
    public List<Videojuego> listar() {
        return new ArrayList<>(videojuegos.values());
    }

    @GetMapping("/{id}")
    public Videojuego obtener(@PathVariable int id) {
        return videojuegos.get(id);
    }

    @PostMapping
    public String agregar(@RequestBody Videojuego videojuego) {
        if (videojuegos.containsKey(videojuego.getId()) || 
            videojuegos.values().stream().anyMatch(v -> v.getNombre().equalsIgnoreCase(videojuego.getNombre()))) {
            return "Error: ID o nombre ya existe.";
        }
        videojuegos.put(videojuego.getId(), videojuego);
        return "Videojuego agregado con ID: " + videojuego.getId();
    }

    @PutMapping("/{id}")
    public String modificar(@PathVariable int id, @RequestBody Videojuego videojuego) {
        if (!videojuegos.containsKey(id)) {
            return "Error: Videojuego no encontrado.";
        }
        videojuego.setId(id);
        videojuegos.put(id, videojuego);
        return "Videojuego modificado con ID: " + id;
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable int id) {
        if (videojuegos.remove(id) != null) {
            return "Videojuego eliminado con ID: " + id;
        } else {
            return "Error: Videojuego no encontrado.";
        }
    }
}
