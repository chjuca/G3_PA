/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Jugador;
import Data.Importar;
import interfaz.Login;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Juca
 */
public class LogLogin {

    public void IngresarJugador(String user, String pass, Login login) {

        Jugador ObjJugador = Import_Jugador(user);

        if (user.equals(ObjJugador.getCedula()) && pass.equals(ObjJugador.getContraseña())) {
            login.dispose();
            JOptionPane.showMessageDialog(null, "Bienvenido\n"
                    + "Acceso Correcto", "",
                    JOptionPane.INFORMATION_MESSAGE);
//            
//            
//            SIGUIENTE FORMULARIO
//                    
//       
        } else {

            JOptionPane.showMessageDialog(null, "Por favor ingrese un usuario y/o contraseña correctos", "",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public Jugador Import_Jugador(String user) {

        Importar ObjImportar = new Importar();
        ArrayList<Jugador> list_Jugador = ObjImportar.LeerJson();

        Jugador ObjJugador = new Jugador();
        
        for (Jugador ObjJugadorAux : list_Jugador) {
            if (user.equals(ObjJugadorAux.getCedula())) {
                ObjJugador = ObjJugadorAux;
                return ObjJugador;
            }
        }
        for (Jugador ObjJugadorAux : list_Jugador) {
            System.out.println(ObjJugador.toString());
        }
        return ObjJugador;
    }
}
