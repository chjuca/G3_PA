/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Jugador;
import Clases.Miembro;
import interfaz.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Juca
 */
public class LogLogin {

    public void IngresarJugador(String user, String pass, Miembro ObjMiembro, Login login) {
        if (user.equals("a") && pass.equals("1")) {
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
            JOptionPane.showMessageDialog(null,"Por favor ingrese un usuario y/o contraseña correctos", "",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
