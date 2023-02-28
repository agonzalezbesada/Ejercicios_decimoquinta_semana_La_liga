/**
 * Rige las normas de los equipos
 * @author Adrián
 * @version 1.0
 */
public interface Equipo {
    /**
     * Devuelve el nombre del equipo
     * @return Nombre del equipo
     */
    String getNombreEquipo();

    /**
     * Decide los goles del equipo
     */
    void setGoles();

    /**
     * Devuelve los goles del equipo
     * @return Goles del equipo
     */
    int getGoles();

    /**
     *
     */
    void setPartidosJugados();

    /**
     * Devuelve los partidos jugados
     * @return Partidos jugados
     */
    int getPartidosJugados();

    /**
     *
     */
    void setGolesFavor(int golesFavor);

    /**
     * Devuelve los goles a favor
     * @return Goles a favor
     */
    int getGolesFavor();

    /**
     *
     */
    void setGolesContra(int golesContra);

    /**
     * Devuelve los goles en contra
     * @return Goles en contra
     */
    int getGolesContra();

    /**
     *
     */
    void setVictorias();

    /**
     * Devuelve las victorias
     * @return Victorias
     */
    int getVictorias();

    /**
     *
     */
    void setDerrotas();

    /**
     * Devuelve las derrotas
     * @return Derrotas
     */
    int getDerrotas();

    /**
     *
     */
    void setEmpates();

    /**
     * Devuelve los empates
     * @return Empates
     */
    int getEmpates();

    /**
     *
     */
    void setPuntuacion();

    /**
     * Devuelve la puntuacion
     * @return Puntuacion
     */
    int getPuntuacion();
}
