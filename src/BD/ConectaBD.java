package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectaBD {
//CLASE PARA CONECTARSE CADA VEZ QUE SE INICIA EL PROGRAMA A LA BD

    public static void connect() {

        Connection conn = null;

        try {

            String url = "jdbc:sqlite:/home/local/DANIELCASTELAO/lvaqueiroperez/CLASE/NetBeansProjects/Boletines_Progra/PROYECTOEV3/BD.db";
            conn = DriverManager.getConnection(url);

            JOptionPane.showMessageDialog(null, "Conectado a la BD");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Fallo en la conexión, asegúrate de poner bien el nombre de la BD");

        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
