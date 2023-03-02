/**
 * Rige las normas de las ligas
 * @author Adrián
 * @version 1.0
 */
public interface Liga {
    /**
     * Matriz con los equipos
     */
    Equipo_futbol[][] equipos = new Equipo_futbol[11][2];


    /**
     * Calcula los resultados de los partidos
     */
    void calcularJornada(int jornada);

    /**
     * Muestra los resultados de los partidos
     */
    void consultarTabla();

    // void rellenarEquipos(); Da error por ser privado

}
