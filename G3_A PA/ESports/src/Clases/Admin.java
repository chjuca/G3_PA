package Clases;


import Clases.Miembro;
import java.util.*;

/**
 * 
 */
public class Admin extends Miembro {

    public String carrera;
    
    public Admin() {
    }

    public Admin(String carrera, String cedula, String nombres, String apellidos, String contraseña) {
        super(cedula, nombres, apellidos, contraseña);
        this.carrera = carrera;
    }


}