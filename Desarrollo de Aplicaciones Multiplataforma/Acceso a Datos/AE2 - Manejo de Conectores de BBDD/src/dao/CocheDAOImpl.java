package dao;

import models.Coche;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CocheDAOImpl implements CocheDAO {
    private Connection conexion;

    public CocheDAOImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public void insertarCoche(Coche coche) {
        String sql = "INSERT INTO coches (marca, modelo, color) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, coche.getMarca());
            stmt.setString(2, coche.getModelo());
            stmt.setString(3, coche.getColor());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void borrarCochePorId(int id) {
        String sql = "DELETE FROM coches WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Coche consultarCochePorId(int id) {
        String sql = "SELECT * FROM coches WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Coche(
                    rs.getInt("id"),
                    rs.getString("marca"),
                    rs.getString("modelo"),
                    rs.getString("color")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Coche> listarCoches() {
        List<Coche> coches = new ArrayList<>();
        String sql = "SELECT * FROM coches";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                coches.add(new Coche(
                    rs.getInt("id"),
                    rs.getString("marca"),
                    rs.getString("modelo"),
                    rs.getString("color")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return coches;
    }

    @Override
    public void modificarCochePorId(int id, Coche coche) {
        String sql = "UPDATE coches SET marca = ?, modelo = ?, color = ? WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, coche.getMarca());
            stmt.setString(2, coche.getModelo());
            stmt.setString(3, coche.getColor());
            stmt.setInt(4, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
