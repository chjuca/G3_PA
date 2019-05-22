/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.Registro;
import java.util.Date;

/**
 *
 * @author Carlos Juca
 */
public class LogAsistencia {
    public Registro crearAsistencia(Date fecha){
        Registro ObjAsistencia = new Registro(fecha);
        return ObjAsistencia;
    }
}
