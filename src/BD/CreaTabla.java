package BD;

import java.sql.*;
import javax.swing.JOptionPane;

public class CreaTabla {

    //cliente y su factura
    public static void tablaClientesF() {

        String url = "jdbc:sqlite:/home/local/DANIELCASTELAO/lvaqueiroperez/CLASE/NetBeansProjects/Boletines_Progra/PROYECTOEV3/BD.db";

        String sql = "CREATE TABLE IF NOT EXISTS clientesF (\n"
                + "	nombre text NOT NULL PRIMARY KEY,\n"
                + "	direccion text NOT NULL,\n"
                + "	telf text NOT NULL,\n"
                + "	numProductos integer NOT NULL,\n"
                + "	precioT real NOT NULL\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {

            stmt.execute(sql);

            JOptionPane.showMessageDialog(null, "Tabla creada");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            JOptionPane.showConfirmDialog(null, "ERROR EN TABLA , revisa la excepción");
        }
    }

    public static void tablaPartesCoches() {

        String url = "jdbc:sqlite:/home/local/DANIELCASTELAO/lvaqueiroperez/CLASE/NetBeansProjects/Boletines_Progra/PROYECTOEV3/BD.db";

        String sql = "CREATE TABLE IF NOT EXISTS  pCoches (\n"
                + "	nombre text NOT NULL PRIMARY KEY,\n"
                + "	unidades integer NOT NULL,\n"
                + "	precio real NOT NULL\n"
                + ");";

        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {

            stmt.execute(sql);

            JOptionPane.showMessageDialog(null, "Tabla creada");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            JOptionPane.showConfirmDialog(null, "ERROR EN TABLA , revisa la excepción");
        }
    }

}
