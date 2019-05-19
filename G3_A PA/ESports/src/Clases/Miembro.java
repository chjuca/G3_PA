package Clases;

import java.util.*;

/**
 *
 */
public class Miembro {

    public String cedula;
    public String nombres;
    public String apellidos;
    public String contraseña;

    public Miembro() {
    }

    public Miembro(String cedula, String nombres, String apellidos, String contraseña) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    

}
