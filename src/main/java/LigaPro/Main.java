package LigaPro;

import LigaPro.modelo.Equipo;
import LigaPro.servicios.Torneo;

public class Main {

    public static void main(String[] args) {


        Equipo equipo1 = new Equipo("Liga de Quito");
        Equipo equipo2 = new Equipo("Barcelona SC");
        Equipo equipo3 = new Equipo("Emelec");
        Equipo equipo4 = new Equipo("Aucas");
        Equipo equipo5 = new Equipo("Independiente del Valle");
        Equipo equipo6 = new Equipo("El Nacional");




        Torneo torneo = new Torneo();


        torneo.agregarEquipo(equipo1);
        torneo.agregarEquipo(equipo2);
        torneo.agregarEquipo(equipo3);
        torneo.agregarEquipo(equipo4);
        torneo.agregarEquipo(equipo5);
        torneo.agregarEquipo(equipo6);




        torneo.registrarEnfrentamiento(equipo1, equipo2);
        torneo.registrarEnfrentamiento(equipo1, equipo3);

        torneo.registrarEnfrentamiento(equipo2, equipo4);
        torneo.registrarEnfrentamiento(equipo2, equipo5);

        torneo.registrarEnfrentamiento(equipo3, equipo4);
        torneo.registrarEnfrentamiento(equipo3, equipo6);

        torneo.registrarEnfrentamiento(equipo4, equipo6);
        torneo.registrarEnfrentamiento(equipo5, equipo6);


        torneo.registrarResultado(
                equipo1,
                equipo2,
                3,
                0
        );


        torneo.registrarResultado(
                equipo3,
                equipo4,
                1,
                1
        );


        torneo.registrarResultado(
                equipo5,
                equipo6,
                3,
                0
        );


        torneo.registrarResultado(
                equipo2,
                equipo4,
                3,
                0
        );




        torneo.mostrarTorneo();




        Equipo[] equipos = {
                equipo1,
                equipo2,
                equipo3,
                equipo4,
                equipo5,
                equipo6
        };

        torneo.mostrarTabla(equipos);




        torneo.realizarBFS(equipo1);




        torneo.realizarDFS(equipo1);
    }
}