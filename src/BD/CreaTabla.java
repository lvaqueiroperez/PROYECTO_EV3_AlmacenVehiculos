package BD;

import java.sql.*;
import javax.swing.JOptionPane;

public class CreaTabla {

    public static void tablaAdmins() {

        String url = "jdbc:sqlite:C:\\Users\\luis-\\Desktop\\1º DAM\\Netbeans Projects\\SUBIR_Y_BORRAR\\BD.db";

        String sql = "CREATE TABLE IF NOT EXISTS admins (\n"
                + "	dni text NOT NULL PRIMARY KEY,\n"
                + "	nombre text NOT NULL,\n"
                + "      passw  text NOT NULL\n"
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

    public static void tablaClientes() {

        String url = "jdbc:sqlite:C:\\Users\\luis-\\Desktop\\1º DAM\\Netbeans Projects\\SUBIR_Y_BORRAR\\BD.db";

        String sql = "CREATE TABLE IF NOT EXISTS clientes (\n"
                + "	dni text NOT NULL PRIMARY KEY,\n"
                + "	nombre text NOT NULL\n"
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

        String url = "jdbc:sqlite:C:\\Users\\luis-\\Desktop\\1º DAM\\Netbeans Projects\\SUBIR_Y_BORRAR\\BD.db";

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

    public static void tablaCoches() {

        String url = "jdbc:sqlite:C:\\Users\\luis-\\Desktop\\1º DAM\\Netbeans Projects\\SUBIR_Y_BORRAR\\BD.db";

        String sql = "CREATE TABLE IF NOT EXISTS coches (\n"
                + "	matricula text NOT NULL PRIMARY KEY,\n"
                + "	nombre text NOT NULL,\n"
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
