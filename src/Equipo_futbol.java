/**
 * Clase del equipo
 * @author Adrián
 * @version 1.0
 */
public class Equipo_futbol implements Equipo{
    /**
     * Nombre del equipo
     */
    private String nombreEquipo;
    /**
     * Goles del equipo
     */
    private int goles;
    private int partidosJugados;
    private int golesFavor;
    private int golesContra;
    private int victorias;
    private int derrotas;
    private int empates;
    private int puntuacion;


    Equipo_futbol() {

    }

    Equipo_futbol(String nombre) {
        this.nombreEquipo=nombre;
    }


    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo=nombreEquipo;
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setGoles() {
        int goles = (int) (Math.random() * (10-0+1) + 0);
        setGolesFavor(goles);
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }

    public void setPartidosJugados() {
        partidosJugados++;
        this.partidosJugados=partidosJugados;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setGolesFavor(int goles) {
        this.golesFavor += goles;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra=golesContra;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setVictorias() {
        victorias++;
        this.victorias=victorias;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setDerrotas() {
        derrotas++;
        this.derrotas=derrotas;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setEmpates() {
        empates++;
        this.empates=empates;
    }

    public int getEmpates() {
        return empates;
    }

    public void setPuntuacion() {
        this.puntuacion=puntuacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }
}

























