package Clases;


import Clases.Miembro;
import java.util.*;

/**
 * 
 */
public class Coach extends Miembro {

    public int funcion;
    
    public Coach() {
    }

    public Coach(int funcion, String cedula, String nombres, String apellidos, String contraseña) {
        super(cedula, nombres, apellidos, contraseña);
        this.funcion = funcion;
    }



}