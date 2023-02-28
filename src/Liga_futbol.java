public class Liga_futbol implements Liga {


    private String nombreLiga;

    Liga_futbol() {

    }

    Liga_futbol(String nombre) {
        this.nombreLiga=nombre;
        rellenarEquipos();
    }

    public String getNombreLiga() {
        return nombreLiga;
    }

    public void decirNombre() {
        System.out.println(equipos[1].getNombreEquipo());

    }

    private void rellenarEquipos() {
        Equipo_futbol equipo1 = new Equipo_futbol("equipo1");
        Equipo_futbol equipo2 = new Equipo_futbol("equipo2");
        Equipo_futbol equipo3 = new Equipo_futbol("equipo3");
        Equipo_futbol equipo4 = new Equipo_futbol("equipo4");
        Equipo_futbol equipo5 = new Equipo_futbol("equipo5");
        Equipo_futbol equipo6 = new Equipo_futbol("equipo6");
        Equipo_futbol equipo7 = new Equipo_futbol("equipo7");
        Equipo_futbol equipo8 = new Equipo_futbol("equipo8");
        Equipo_futbol equipo9 = new Equipo_futbol("equipo9");
        Equipo_futbol equipo10 = new Equipo_futbol("equipo10");
        Equipo_futbol equipo11 = new Equipo_futbol("equipo11");
        Equipo_futbol equipo12 = new Equipo_futbol("equipo12");
        Equipo_futbol equipo13 = new Equipo_futbol("equipo13");
        Equipo_futbol equipo14 = new Equipo_futbol("equipo14");
        Equipo_futbol equipo15 = new Equipo_futbol("equipo15");
        Equipo_futbol equipo16 = new Equipo_futbol("equipo16");
        Equipo_futbol equipo17 = new Equipo_futbol("equipo17");
        Equipo_futbol equipo18 = new Equipo_futbol("equipo18");
        Equipo_futbol equipo19 = new Equipo_futbol("equipo19");
        Equipo_futbol equipo20 = new Equipo_futbol("equipo20");
        Equipo_futbol equipo21 = new Equipo_futbol("equipo21");
        Equipo_futbol equipo22 = new Equipo_futbol("equipo22");

        equipos[0] = equipo1;
        equipos[1] = equipo2;
        equipos[2] = equipo3;
        equipos[3] = equipo4;
        equipos[4] = equipo5;
        equipos[5] = equipo6;
        equipos[6] = equipo7;
        equipos[7] = equipo8;
        equipos[8] = equipo9;
        equipos[9] = equipo10;
        equipos[10] = equipo11;
        equipos[11] = equipo12;
        equipos[12] = equipo13;
        equipos[13] = equipo14;
        equipos[14] = equipo15;
        equipos[15] = equipo16;
        equipos[16] = equipo17;
        equipos[17] = equipo18;
        equipos[18] = equipo19;
        equipos[19] = equipo20;
        equipos[20] = equipo21;
        equipos[21] = equipo22;
    }

    public void calcularJornada() {

        for (int i = 0; i<=11; i++) {
            equipos[i].setGoles();
            equipos[i+1].setGoles();
            if (equipos[0].getGoles()>equipos[i+1].getGoles()) {
                System.out.println("Gana equipo 1");
            } else if (equipos[0].getGoles()<equipos[i+1].getGoles()) {
                System.out.println("Gana equipo 2");
            } else {
                System.out.println("Empate");
            }
        }


    }

    public void consultarTabla() {

    }





}



















