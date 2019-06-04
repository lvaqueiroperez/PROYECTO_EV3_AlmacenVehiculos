package BD;

//CLASE SOLO PARA CREAR UNA VEZ LA BD, LUEGO NO SE USA
//HACER QUE SE CONECTE DIRECTAMENTE
//HABRÁ VARIAS TABLAS
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CreaBD {

    public static void createNewDatabase() {

        String url = "jdbc:sqlite:C:\\Users\\luis-\\Desktop\\1º DAM\\Netbeans Projects\\SUBIR_Y_BORRAR\\BD.db";
        try (Connection conn = DriverManager.getConnection(url)) {

            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                JOptionPane.showMessageDialog(null, "BD Creada");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "ERROR al crear la BD, revisa las execepciones");
        }
    }

}
