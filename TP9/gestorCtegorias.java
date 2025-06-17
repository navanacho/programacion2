package TP9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class gestorCtegorias {
     private final String URL = "jdbc:mysql://localhost:3306/mi_base";
    private final String USER = "root";
    private final String PASS = "tu_password";

    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public void agregarCategoria(String nombre, String descripcion) {
        if (existeCategoria(nombre)) {
            System.out.println("Ya existe una categoría con ese nombre.");
            return;
        }

        String sql = "INSERT INTO categorias (nombre, descripcion) VALUES (?, ?)";
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.executeUpdate();
            System.out.println("Categoría agregada con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Categoria mostrarCategoria(int id) {
        String sql = "SELECT * FROM categorias WHERE id = ?";
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Categoria(rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Categoria> listarCategorias() {
        List<Categoria> lista = new ArrayList<>();
        String sql = "SELECT * FROM categorias";
        try (Connection con = conectar(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Categoria(rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void actualizarCategoria(int id, String nombre, String descripcion) {
        String sql = "UPDATE categorias SET nombre = ?, descripcion = ? WHERE id = ?";
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setInt(3, id);
            int filas = ps.executeUpdate();
            System.out.println(filas > 0 ? "Categoría actualizada." : "No se encontró la categoría.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCategoria(int id) {
        String sql = "DELETE FROM categorias WHERE id = ?";
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            System.out.println(filas > 0 ? "Categoría eliminada." : "Categoría no encontrada.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private boolean existeCategoria(String nombre) {
        String sql = "SELECT COUNT(*) FROM categorias WHERE nombre = ?";
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt(1) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
