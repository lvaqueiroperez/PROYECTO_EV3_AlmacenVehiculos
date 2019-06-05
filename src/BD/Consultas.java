package BD;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Consultas {

    public static boolean comprobarParte(String nombre, int unidades) {

        boolean validez = false;

        String url = "jdbc:sqlite:/home/local/DANIELCASTELAO/lvaqueiroperez/CLASE/NetBeansProjects/Boletines_Progra/PROYECTOEV3/BD.db";

        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        String sqlT1 = "SELECT unidades FROM pCoches WHERE nombre = ?";

        try (Connection conn = conne;
                PreparedStatement pstmt = conn.prepareStatement(sqlT1)) {

            pstmt.setString(1, nombre);

            ResultSet rs1 = pstmt.executeQuery();

            int unidadesBD = rs1.getInt("unidades");

            if ((unidadesBD == unidades) || (unidadesBD > unidades)) {

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

        String url = "jdbc:sqlite:/home/local/DANIELCASTELAO/lvaqueiroperez/CLASE/NetBeansProjects/Boletines_Progra/PROYECTOEV3/BD.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void updateTablapCoches(String nombre, int unidades) {

        String sql = "SELECT unidades FROM pCoches WHERE nombre = ?";

        String sql2 = "UPDATE pCoches SET unidades = ?  "
                + "WHERE nombre = ?";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                PreparedStatement pstmt2 = conn.prepareStatement(sql2);) {

            pstmt.setString(1, nombre);

            ResultSet r1 = pstmt.executeQuery();

            int unidadesBD = r1.getInt("unidades");

            pstmt2.setInt(1, unidadesBD - unidades);
            pstmt2.setString(2, nombre);

            pstmt2.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos modificados");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "ERROR, asegúrate de que has insertado los datos correctamente");
        }
    }

    public static ArrayList<Object[]> selectAll() {

        ArrayList<Object[]> datosArrayList = new ArrayList<>();
        String url = "jdbc:sqlite:/home/local/DANIELCASTELAO/lvaqueiroperez/CLASE/NetBeansProjects/Boletines_Progra/PROYECTOEV3/BD.db";

        Connection conne = null;
        try {
            conne = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        String sqlT1 = "SELECT nombre,direccion,telf,numProductos,precioT FROM clientesF";

        try (Connection conn = conne;
                Statement stmt = conn.createStatement();
                Statement stmt2 = conn.createStatement();
                ResultSet rs1 = stmt.executeQuery(sqlT1);) {

            while (rs1.next()) {

                Object[] arrayDatos = new Object[5];
                arrayDatos[0] = rs1.getString("nombre");
                arrayDatos[1] = rs1.getString("direccion");
                arrayDatos[2] = rs1.getString("telf");
                arrayDatos[3] = rs1.getInt("numProductos");
                arrayDatos[4] = rs1.getFloat("precioT");
                datosArrayList.add(arrayDatos);

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                conne.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //DEVOLVEMOS EL ARRAYLIST CON TODAS LAS FILAS DE LA TABLA
        return datosArrayList;
    }

}
