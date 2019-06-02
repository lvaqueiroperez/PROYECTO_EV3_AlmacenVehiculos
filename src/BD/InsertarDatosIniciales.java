package BD;

import java.sql.*;
import javax.swing.JOptionPane;

public class InsertarDatosIniciales {

    private Connection connect() {

        String url = "jdbc:sqlite:C:\\Users\\luis-\\Desktop\\1º DAM\\Netbeans Projects\\Boletines_Progra\\EV3PROYECTO\\BD.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insertAdmins(String dni, String nombre, String passw) {

        String sql = "INSERT INTO admins (dni,nombre,passw) VALUES(?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, dni);
            pstmt.setString(2, nombre);
            pstmt.setString(3, passw);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos insertados");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "ERROR, asegúrate de que has insertado los datos correctamente");
        }
    }

    public void insertClientes(String dni, String nombre) {

        String sql = "INSERT INTO clientes (dni,nombre) VALUES(?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, dni);
            pstmt.setString(2, nombre);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos insertados");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "ERROR, asegúrate de que has insertado los datos correctamente");
        }
    }

    public void insertPCoches(String nombre, int unidades, float precio) {

        String sql = "INSERT INTO pCoches (nombre,unidades,precio) VALUES(?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setInt(2, unidades);
            pstmt.setFloat(3, precio);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos insertados");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "ERROR, asegúrate de que has insertado los datos correctamente");
        }
    }

    public void insertCoches(String matricula, String nombre, int unidades, float precio) {

        String sql = "INSERT INTO coches (matricula,nombre,unidades,precio) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, matricula);
            pstmt.setString(2, nombre);
            pstmt.setInt(3, unidades);
            pstmt.setFloat(4, precio);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos insertados");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "ERROR, asegúrate de que has insertado los datos correctamente");
        }
    }

}
