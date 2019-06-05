package BD;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CreaBD {

    public static void createNewDatabase() {

         String url = "jdbc:sqlite:/home/local/DANIELCASTELAO/lvaqueiroperez/CLASE/NetBeansProjects/Boletines_Progra/PROYECTOEV3/BD.db";
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
