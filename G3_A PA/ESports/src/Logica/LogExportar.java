/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Jugador;
import Data.ExpJugador;

/**
 *
 * @author Carlos Juca
 */
public class LogExportar {
    public void CrearJugador(Jugador ObjJugador){
        ExpJugador ObjExportar = new ExpJugador();
        ObjExportar.Crear(ObjJugador);
    }
}
