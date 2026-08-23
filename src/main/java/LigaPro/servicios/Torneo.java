package LigaPro.servicios;

import LigaPro.grafo.GrafoTorneo;
import LigaPro.modelo.Equipo;

public class Torneo {

    private GrafoTorneo grafo;

    public Torneo() {
        grafo = new GrafoTorneo();
    }

    // Agregar equipo
    public void agregarEquipo(Equipo equipo) {

        grafo.agregarEquipo(equipo);
    }

    // Registrar que dos equipos se enfrentaron
    public void registrarEnfrentamiento(
            Equipo equipo1,
            Equipo equipo2) {

        grafo.agregarEnfrentamiento(equipo1, equipo2);
    }


    public void registrarResultado(
            Equipo equipo1,
            Equipo equipo2,
            int puntosEquipo1,
            int puntosEquipo2) {

        equipo1.jugarPartido();
        equipo2.jugarPartido();

        equipo1.sumarPuntos(puntosEquipo1);
        equipo2.sumarPuntos(puntosEquipo2);
    }


    public void mostrarTorneo() {

        grafo.mostrarGrafo();
    }


    public void realizarBFS(Equipo equipo) {

        grafo.recorridoBFS(equipo);
    }


    public void realizarDFS(Equipo equipo) {

        grafo.recorridoDFS(equipo);
    }


    public void mostrarTabla(Equipo[] equipos) {

        System.out.println();
        System.out.println("===== TABLA DEL TORNEO =====");

        for (Equipo equipo : equipos) {

            System.out.println(equipo);
        }
    }
}