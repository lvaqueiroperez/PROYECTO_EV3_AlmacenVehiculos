package almacen_taller_vehiculos;
//ir haciendo

import BD.ConectaBD;
import BD.CreaBD;
import BD.CreaTabla;
import BD.InsertarDatosIniciales;
import Menu.MenuCliente;
import Menu.MenuAcceso;
import Menu.MenuGUI;
import javax.swing.JOptionPane;
import utilities.PedirDatos;

/**
 *
 * @author luis-
 */
public class Almacen_Taller_Vehiculos extends MenuAcceso {

    public static void main(String[] args) {

        //CONEXIÓN A LA BD CADA VEZ QUE SE INICIA EL PROGRAMA
        ConectaBD.connect();

        MenuGUI objM = new MenuGUI();
        objM.setVisible(true);
        //
        //
//        MenuAcceso objAc = new MenuAcceso();

//        int opcion;
//
//        do {
//
//            opcion = PedirDatos.entero("1- CLIENTES\n2- ADMINISTRADORES\n0- SALIR");
//
//            switch (opcion) {
//
//                case 1:
//
//                    objAc.accederMenu(Personas.CLIENTES);
//                    break;
//
//                case 2:
//
//                    objAc.accederMenu(Personas.ADMINS);
//
//                    break;
//
//                case 0:
//                    System.exit(0);
//
//                default:
//                    JOptionPane.showMessageDialog(null, "Introduzca una opción numérica válida");
//
//            }
//
//        } while (opcion != 0);
    }
}
