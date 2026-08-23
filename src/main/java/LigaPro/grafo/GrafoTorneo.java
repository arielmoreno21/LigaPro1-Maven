package LigaPro.grafo;

import LigaPro.modelo.Equipo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GrafoTorneo {

    private Map<Equipo, List<Equipo>> conexiones;

    public GrafoTorneo() {
        conexiones = new HashMap<>();
    }

    // Agregar un equipo al grafo
    public void agregarEquipo(Equipo equipo) {

        if (!conexiones.containsKey(equipo)) {
            conexiones.put(equipo, new ArrayList<>());
        }
    }

    // Crear una conexión entre dos equipos
    public void agregarEnfrentamiento(Equipo equipo1, Equipo equipo2) {

        agregarEquipo(equipo1);
        agregarEquipo(equipo2);

        conexiones.get(equipo1).add(equipo2);
        conexiones.get(equipo2).add(equipo1);
    }

    // Mostrar todos los equipos y sus rivales
    public void mostrarGrafo() {

        System.out.println("===== GRAFO DEL TORNEO =====");

        for (Map.Entry<Equipo, List<Equipo>> entrada : conexiones.entrySet()) {

            Equipo equipo = entrada.getKey();
            List<Equipo> rivales = entrada.getValue();

            System.out.print(equipo.getNombre() + " -> ");

            for (Equipo rival : rivales) {
                System.out.print(rival.getNombre() + " ");
            }

            System.out.println();
        }
    }

    // BFS
    public void recorridoBFS(Equipo inicio) {

        Set<Equipo> visitados = new HashSet<>();

        Queue<Equipo> cola = new LinkedList<>();

        visitados.add(inicio);
        cola.add(inicio);

        System.out.println();
        System.out.println("===== RECORRIDO BFS =====");

        while (!cola.isEmpty()) {

            Equipo actual = cola.poll();

            System.out.println("Visitando: " + actual.getNombre());

            List<Equipo> rivales = conexiones.get(actual);

            for (Equipo rival : rivales) {

                if (!visitados.contains(rival)) {

                    visitados.add(rival);
                    cola.add(rival);
                }
            }
        }
    }

    // DFS
    public void recorridoDFS(Equipo inicio) {

        Set<Equipo> visitados = new HashSet<>();

        System.out.println();
        System.out.println("===== RECORRIDO DFS =====");

        dfsRecursivo(inicio, visitados);
    }

    // Método recursivo utilizado por DFS
    private void dfsRecursivo(
            Equipo actual,
            Set<Equipo> visitados) {

        visitados.add(actual);

        System.out.println("Visitando: " + actual.getNombre());

        List<Equipo> rivales = conexiones.get(actual);

        for (Equipo rival : rivales) {

            if (!visitados.contains(rival)) {

                dfsRecursivo(rival, visitados);
            }
        }
    }
}