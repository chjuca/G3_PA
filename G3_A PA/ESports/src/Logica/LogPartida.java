/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Partida;

/**
 *
 * @author Carlos Juca
 */
public class LogPartida {
    public Partida AgregarPartida(int muertes, int asistencias, int asesinatos, int farm){
        Partida ObjPartida = new Partida(muertes, asistencias, asesinatos, farm);
        return ObjPartida;
    }
}
