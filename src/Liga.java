public class Liga implements NormasLiga{


    private String nombreLiga;

    private Equipo[] equipos = new Equipo[22];

    Liga() {

    }

    Liga(String nombre) {
        this.nombreLiga=nombre;
        rellenarEquipos();
        decirNombre();
    }

    public String getNombreLiga() {
        return nombreLiga;
    }

    public void decirNombre() {
        System.out.println(equipos[1].getNombreEquipo());

    }

    private void rellenarEquipos() {
        Equipo equipo1 = new Equipo("equipo1");
        Equipo equipo2 = new Equipo("equipo2");
        Equipo equipo3 = new Equipo("equipo3");
        Equipo equipo4 = new Equipo("equipo4");
        Equipo equipo5 = new Equipo("equipo5");
        Equipo equipo6 = new Equipo("equipo6");
        Equipo equipo7 = new Equipo("equipo7");
        Equipo equipo8 = new Equipo("equipo8");
        Equipo equipo9 = new Equipo("equipo9");
        Equipo equipo10 = new Equipo("equipo10");
        Equipo equipo11 = new Equipo("equipo11");
        Equipo equipo12 = new Equipo("equipo12");
        Equipo equipo13 = new Equipo("equipo13");
        Equipo equipo14 = new Equipo("equipo14");
        Equipo equipo15 = new Equipo("equipo15");
        Equipo equipo16 = new Equipo("equipo16");
        Equipo equipo17 = new Equipo("equipo17");
        Equipo equipo18 = new Equipo("equipo18");
        Equipo equipo19 = new Equipo("equipo19");
        Equipo equipo20 = new Equipo("equipo20");
        Equipo equipo21 = new Equipo("equipo21");
        Equipo equipo22 = new Equipo("equipo22");

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

    public void jugarLiga() {

    }





}



















