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

//        CreaBD.createNewDatabase();
        //CONEXIÓN A LA BD CADA VEZ QUE SE INICIA EL PROGRAMA
        ConectaBD.connect();

//        CreaTabla.tablaAdmins();
//        CreaTabla.tablaClientes();
//        CreaTabla.tablaCoches();
//        CreaTabla.tablaPartesCoches();
//        InsertarDatosIniciales obj = new InsertarDatosIniciales();
//
//        obj.insertAdmins("1111", "Paco", "123");
//        obj.insertClientes("1111", "Pepe");
//        obj.insertPCoches("liquidoFrenos", 5, 5.75f);
//        obj.insertPCoches("cinturones", 2, 4f);
//        obj.insertPCoches("llantas", 2, 15f);
//        obj.insertPCoches("neumaticos", 2, 17.5f);
//        obj.insertPCoches("radios", 2, 23f);
//        obj.insertPCoches("altavoces", 2, 30f);
//        obj.insertCoches("1212", "FordMustang", 2, 15000f);
//        obj.insertCoches("1313", "AudiA4", 2, 17000f);
//        obj.insertCoches("1414", "BMWZ4", 2, 29000f);
//        obj.insertCoches("1515", "JeepWrangler", 2, 20000f);
//        obj.insertCoches("1616", "OpelCorsa", 2, 5000f);
//        obj.insertCoches("1717", "NissanMicra", 2, 15000f);
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
