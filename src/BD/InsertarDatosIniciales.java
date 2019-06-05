package BD;

import java.sql.*;
import javax.swing.JOptionPane;

public class InsertarDatosIniciales {

    private Connection connect() {

        String url = "jdbc:sqlite:/home/local/DANIELCASTELAO/lvaqueiroperez/CLASE/NetBeansProjects/Boletines_Progra/PROYECTOEV3/BD.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insertClientesF(String nombre, String direccion, String telf, int numP, Float precioT) {

        String sql = "INSERT INTO clientesF (nombre,direccion,telf,numProductos,precioT) VALUES(?,?,?,?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, direccion);
            pstmt.setString(3, telf);
            pstmt.setInt(4, numP);
            pstmt.setFloat(5, precioT);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Gracias por su compra");

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
