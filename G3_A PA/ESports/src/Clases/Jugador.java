package Clases;

import Clases.Miembro;
import java.util.*;

/**
 *
 */
public class Jugador extends Miembro {

    public String nickname;
    public int nivelClasificatoria;
    public String posicion;
    public int funcion;

    public Jugador() {
    }

    public Jugador(String nickname, int nivelClasificatoria, String posicion, int funcion, String cedula, String nombres, String apellidos, String contraseña) {
        super(cedula, nombres, apellidos, contraseña);
        this.nickname = nickname;
        this.nivelClasificatoria = nivelClasificatoria;
        this.posicion = posicion;
        this.funcion = funcion;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getNivelClasificatoria() {
        return nivelClasificatoria;
    }

    public void setNivelClasificatoria(int nivelClasificatoria) {
        this.nivelClasificatoria = nivelClasificatoria;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getFuncion() {
        return funcion;
    }

    public void setFuncion(int funcion) {
        this.funcion = funcion;
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
