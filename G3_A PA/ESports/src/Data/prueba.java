/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Clases.Jugador;
import java.io.*;//no olviden importar esta librería al inicio de su programa

/**
 *
 * @author Carlos Juca
 */
public class prueba {

    //esto es solo un método, no una clase, el método deberá ser incluido en una clase java para su uso
    public void Crear(Jugador ObjJugador) {
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("data/jugador.txt",true);
            pw = new PrintWriter(fichero);
            pw.println(String.format("%s|%s|%s|%s|%d|%s|%s|%d\n", ObjJugador.getCedula(), ObjJugador.getNombres(), ObjJugador.getApellidos(), ObjJugador.getNickname(), ObjJugador.getNivelClasificatoria(), ObjJugador.getPosicion(), ObjJugador.getContraseña(), 1));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
