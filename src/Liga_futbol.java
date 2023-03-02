/**
 * Clase de la liga
 * @author Adrián
 * @version 1.0
 */
public class Liga_futbol implements Liga {


    private String nombreLiga;

    Liga_futbol() {

    }

    Liga_futbol(String nombre) {
        this.nombreLiga = nombre;
        rellenarEquipos();
    }

    public String getNombreLiga() {
        return nombreLiga;
    }

    private void rellenarEquipos() {
        Equipo_futbol equipo1 = new Equipo_futbol("Real Madrid");
        Equipo_futbol equipo2 = new Equipo_futbol("F.C. Barcelona");
        Equipo_futbol equipo3 = new Equipo_futbol("Atlético de Madrid");
        Equipo_futbol equipo4 = new Equipo_futbol("Valencia");
        Equipo_futbol equipo5 = new Equipo_futbol("Sevilla");
        Equipo_futbol equipo6 = new Equipo_futbol("Espanyol");
        Equipo_futbol equipo7 = new Equipo_futbol("Real sociedad");
        Equipo_futbol equipo8 = new Equipo_futbol("Betis Balompié");
        Equipo_futbol equipo9 = new Equipo_futbol("Celta");
        Equipo_futbol equipo10 = new Equipo_futbol("Deport");
        Equipo_futbol equipo11 = new Equipo_futbol("Osasuna");
        Equipo_futbol equipo12 = new Equipo_futbol("Sporting");
        Equipo_futbol equipo13 = new Equipo_futbol("Villareal");
        Equipo_futbol equipo14 = new Equipo_futbol("Las Palmas");
        Equipo_futbol equipo15 = new Equipo_futbol("Granada");
        Equipo_futbol equipo16 = new Equipo_futbol("Getafe");
        Equipo_futbol equipo17 = new Equipo_futbol("Rayo Vallecano");
        Equipo_futbol equipo18 = new Equipo_futbol("Elche");
        Equipo_futbol equipo19 = new Equipo_futbol("Levante");
        Equipo_futbol equipo20 = new Equipo_futbol("Hércules");
        Equipo_futbol equipo21 = new Equipo_futbol("Leganés");
        Equipo_futbol equipo22 = new Equipo_futbol("Esportiu");

        equipos[0][0] = equipo1;
        equipos[0][1] = equipo2;
        equipos[1][0] = equipo3;
        equipos[1][1] = equipo4;
        equipos[2][0] = equipo5;
        equipos[2][1] = equipo6;
        equipos[3][0] = equipo7;
        equipos[3][1] = equipo8;
        equipos[4][0] = equipo9;
        equipos[4][1] = equipo10;
        equipos[5][0] = equipo11;
        equipos[5][1] = equipo12;
        equipos[6][0] = equipo13;
        equipos[6][1] = equipo14;
        equipos[7][0] = equipo15;
        equipos[7][1] = equipo16;
        equipos[8][0] = equipo17;
        equipos[8][1] = equipo18;
        equipos[9][0] = equipo19;
        equipos[9][1] = equipo20;
        equipos[10][0] = equipo21;
        equipos[10][1] = equipo22;
    }

    public void calcularJornada(int jornada) {

        if ((jornada % 2) == 0) {
            System.out.println("\n" + "Ida" + "\n");
        } else {
            System.out.println("\n" + "Vuelta" + "\n");
        }


        for (int i = 0; i <= 10; i++) {
            equipos[i][0].setPartidosJugados();
            equipos[i][1].setPartidosJugados();

            equipos[i][0].setGoles();
            equipos[i][1].setGoles();

            equipos[i][0].setGolesContra(equipos[i][1].getGoles());
            equipos[i][1].setGolesContra(equipos[i][0].getGoles());

            if (equipos[i][0].getGoles() > equipos[i][1].getGoles()) {

                System.out.println("Gana " + equipos[i][0].getNombreEquipo());
                equipos[i][0].setVictorias();
                equipos[i][1].setDerrotas();

            } else if (equipos[i][0].getGoles() < equipos[i][1].getGoles()) {

                System.out.println("Gana " + equipos[i][1].getNombreEquipo());
                equipos[i][1].setVictorias();
                equipos[i][0].setDerrotas();

            } else {

                System.out.println("Empate");
                equipos[i][0].setEmpates();
                equipos[i][1].setEmpates();
            }
        }

    }

    public void consultarTabla() {
        Equipo_futbol aux = new Equipo_futbol();
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 1; j++) {
                for (int k = 0; k <= 10; k++) {
                    for (int l = 0; l <= 1; l++) {
                        if (equipos[i][j].getVictorias() >= equipos[k][l].getVictorias()) {
                            aux = equipos[k][l];
                            equipos[k][l] = equipos[i][j];
                            equipos[i][j] = aux;
                        }
                    }
                }
            }
        }

        for (Equipo_futbol[] i : equipos) {
            for (Equipo_futbol j : i) {
                System.out.println(j.getNombreEquipo() + " Victorias: " + j.getVictorias());
            }
        }
    }
}



















