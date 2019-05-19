package Clases;


import java.util.*;

/**
 * 
 */
public class PartidaPersonalizada extends Partida {

    public int tipo;
    
    public PartidaPersonalizada() {
    }

    public PartidaPersonalizada(int tipo, int muertes, int asistencias, int asesinatos, int farm) {
        super(muertes, asistencias, asesinatos, farm);
        this.tipo = tipo;
    }

    
}