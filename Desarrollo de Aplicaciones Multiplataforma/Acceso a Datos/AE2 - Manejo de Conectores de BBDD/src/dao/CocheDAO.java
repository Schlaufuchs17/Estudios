package dao;

import models.Coche;
import java.util.List;

public interface CocheDAO {
    void insertarCoche(Coche coche);
    void borrarCochePorId(int id);
    Coche consultarCochePorId(int id);
    List<Coche> listarCoches();
    void modificarCochePorId(int id, Coche coche);
}
