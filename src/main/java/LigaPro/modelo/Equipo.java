package LigaPro.modelo;

public class Equipo {

    private String nombre;
    private int puntos;
    private int partidosJugados;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.partidosJugados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public void jugarPartido() {
        this.partidosJugados++;
    }

    @Override
    public String toString() {
        return nombre +
                " | Puntos: " + puntos +
                " | Partidos: " + partidosJugados;
    }
}