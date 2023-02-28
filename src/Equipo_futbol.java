public class Equipo {
    private String nombreEquipo;

    private int goles;

    Equipo() {

    }

    Equipo(String nombre) {
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
