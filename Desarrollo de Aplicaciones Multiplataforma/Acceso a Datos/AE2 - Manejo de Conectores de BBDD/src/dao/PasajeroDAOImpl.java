package dao;

import models.Pasajero;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PasajeroDAOImpl implements PasajeroDAO {
    private Connection conexion;

    public PasajeroDAOImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public void insertarPasajero(Pasajero pasajero) {
        String sql = "INSERT INTO pasajeros (nombre, edad, peso) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, pasajero.getNombre());
            stmt.setInt(2, pasajero.getEdad());
            stmt.setDouble(3, pasajero.getPeso());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarPasajeroPorId(int id) {
        String sql = "DELETE FROM pasajeros WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Pasajero consultarPasajeroPorId(int id) {
        String sql = "SELECT * FROM pasajeros WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Pasajero(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getInt("edad"),
                    rs.getDouble("peso")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Pasajero> listarPasajeros() {
        List<Pasajero> pasajeros = new ArrayList<>();
        String sql = "SELECT * FROM pasajeros";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                pasajeros.add(new Pasajero(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getInt("edad"),
                    rs.getDouble("peso")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pasajeros;
    }
}
