package dao;

import models.Pasajero;
import java.util.List;

public interface PasajeroDAO {
    void insertarPasajero(Pasajero pasajero);
    void borrarPasajeroPorId(int id);
    Pasajero consultarPasajeroPorId(int id);
    List<Pasajero> listarPasajeros();
}
