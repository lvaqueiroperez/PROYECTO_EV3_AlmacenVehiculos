package almacen_taller_vehiculos;

import BD.ConectaBD;
import BD.CreaBD;
import BD.CreaTabla;
import BD.InsertarDatosIniciales;

import Menu.MenuGUI;
import javax.swing.JOptionPane;
import utilities.PedirDatos;

public class Almacen_Taller_Vehiculos {

    public static void main(String[] args) {
//
        CreaBD.createNewDatabase();
        //CONEXIÓN A LA BD CADA VEZ QUE SE INICIA EL PROGRAMA
        ConectaBD.connect();

        CreaTabla.tablaClientesF();

        CreaTabla.tablaPartesCoches();
        InsertarDatosIniciales obj = new InsertarDatosIniciales();

        obj.insertPCoches("liquidoFrenos", 5, 5.75f);
        obj.insertPCoches("cinturones", 2, 4f);
        obj.insertPCoches("llantas", 2, 15f);
        obj.insertPCoches("neumaticos", 2, 17.5f);
        obj.insertPCoches("radios", 2, 23f);
        obj.insertPCoches("altavoces", 2, 30f);
        obj.insertCoches("1212", "FordMustang", 2, 15000f);
        obj.insertCoches("1313", "AudiA4", 2, 17000f);
        obj.insertCoches("1414", "BMWZ4", 2, 29000f);
        obj.insertCoches("1515", "JeepWrangler", 2, 20000f);
        obj.insertCoches("1616", "OpelCorsa", 2, 5000f);
        obj.insertCoches("1717", "NissanMicra", 2, 15000f);
        MenuGUI objM = new MenuGUI();
        objM.setVisible(true);

    }
}
