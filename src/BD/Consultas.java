package BD;

import java.sql.*;
import javax.swing.JOptionPane;

public class Consultas {

    public static boolean comprobarParte(String nombre, int unidades) {

        boolean validez = true;

        String url = "jdbc:sqlite:C:\\Users\\luis-\\Desktop\\1º DAM\\Netbeans Projects\\SUBIR_Y_BORRAR\\BD.db";
        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        String sqlT1 = "SELECT unidades FROM pCoches WHERE nombre =" + nombre;

        try (Connection conn = conne;
                Statement pstmt = conn.createStatement()) {

            ResultSet rs1 = pstmt.executeQuery(sqlT1);

            if (((Integer)rs1.getInt("unidades") == unidades) || ((Integer)rs1.getInt("unidades") < unidades)) {

                validez = true;

            } else {
                validez = false;

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                conne.close();
            } catch (SQLException ex) {
                System.out.println("error al cerrar la bd");
            }
        }

        return validez;

    }

    /**
     * Método para retornar variable de conexión
     *
     * @return variable conn
     */
    private Connection connect() {

        String url = "jdbc:sqlite:C:\\Users\\luis-\\Desktop\\1º DAM\\Netbeans Projects\\SUBIR_Y_BORRAR\\BD.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void updateTablapCoches(String nombre, int unidades) {

        String sql = "UPDATE pCoches SET unidades = ?  "
                + "WHERE nombre = ?";

        String sql2 = "SELECT unidades FROM pCoches WHERE nombre = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                PreparedStatement pstmt2 = conn.prepareStatement(sql);) {

            pstmt2.setString(1, nombre);

            ResultSet r1 = pstmt2.executeQuery();

            pstmt.setInt(1, unidades);
            pstmt.setString(2, nombre);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos modificados");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "ERROR, asegúrate de que has insertado los datos correctamente");
        }
    }

}
