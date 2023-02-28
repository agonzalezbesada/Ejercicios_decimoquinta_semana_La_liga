public class Equipo_futbol implements Equipo{
    private String nombreEquipo;

    private int goles;

    Equipo_futbol() {

    }

    Equipo_futbol(String nombre) {
        this.nombreEquipo=nombre;
    }


    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setGoles() {
        int goles = (int) (Math.random() * (10-0+1) + 0);
        this.goles = goles;
    }

    public int getGoles() {
        return goles;
    }
}
