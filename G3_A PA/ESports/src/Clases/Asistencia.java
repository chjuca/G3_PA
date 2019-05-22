package Clases;

import java.util.*;

/**
 *
 */
public class Asistencia {

    public Date fecha;
    ArrayList <Partida> partidas = new ArrayList<>();

    public Asistencia() {
    }

    public Asistencia(Date fecha) {
        this.fecha = fecha;
    }
    public void AgregarPartida(int muertes, int asistencias, int asesinatos, int farm){
        Partida ObjPartida= new Partida(muertes, asistencias, asesinatos, farm);
        this.partidas.add(ObjPartida);
    }

}
