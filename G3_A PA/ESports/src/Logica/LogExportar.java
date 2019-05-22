/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Jugador;
import Data.Exportar;

/**
 *
 * @author Carlos Juca
 */
public class LogExportar {
    public void CrearJugador(Jugador ObjJugador){
        Exportar ObjExportar = new Exportar();
        ObjExportar.Crear(ObjJugador);
    }
}
