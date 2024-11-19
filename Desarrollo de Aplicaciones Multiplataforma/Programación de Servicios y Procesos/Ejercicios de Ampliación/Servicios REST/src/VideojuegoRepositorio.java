import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VideojuegoRepositorio {
    private List<Videojuego> videojuegos = new ArrayList<>();

    public VideojuegoRepositorio() {
        // Inicializar con 5 videojuegos
        videojuegos.add(new Videojuego(1L, "Juego1", "Compania1", 8.5));
        videojuegos.add(new Videojuego(2L, "Juego2", "Compania2", 9.0));
        videojuegos.add(new Videojuego(3L, "Juego3", "Compania3", 7.5));
        videojuegos.add(new Videojuego(4L, "Juego4", "Compania4", 8.0));
        videojuegos.add(new Videojuego(5L, "Juego5", "Compania5", 8.8));
    }

    public List<Videojuego> listarTodos() {
        return videojuegos;
    }

    public Optional<Videojuego> buscarPorId(Long id) {
        return videojuegos.stream().filter(v -> v.getId().equals(id)).findFirst();
    }

    public void agregar(Videojuego videojuego) {
        videojuegos.add(videojuego);
    }

    public void eliminarPorId(Long id) {
        videojuegos.removeIf(v -> v.getId().equals(id));
    }

    public boolean existeIdONombre(Long id, String nombre) {
        return videojuegos.stream().anyMatch(v -> v.getId().equals(id) || v.getNombre().equalsIgnoreCase(nombre));
    }
}
