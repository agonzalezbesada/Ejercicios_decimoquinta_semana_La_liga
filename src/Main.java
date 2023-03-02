import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);

        Liga_futbol liga1 = null;
        boolean existeLiga = false; // Comprueba si la liga existe
        int jornada = 1; // Variable utilizada para decidir si es ida o vuelta
        int eleccion = 0; // Eleccion del switch

        do {

            System.out.println("Qué desea hacer?"+"\n"+"1. Crear liga"+"\n"+"2. Jugar liga"+"\n"+"3. Eliminar liga actual"+"\n"+"0. Salir");
            eleccion = guardar.nextInt();

            switch(eleccion) {

                case 1:
                    guardar.nextLine();
                    System.out.println("\n"+"Elija un nombre para la liga");
                    String nombre = guardar.nextLine();
                    liga1 = new Liga_futbol(nombre);
                    existeLiga = true;

                    break;

                case 2:

                    if (existeLiga) {
                        int eleccion2 = 0;
                        do {
                            System.out.println("\n"+"Qué desea hacer?"+"\n"+"1. Siguiente jornada"+"\n"+"2. Consultar tabla"+"\n"+"0. Pausar liga");
                            eleccion2 = guardar.nextInt();
                            switch (eleccion2) {

                                case 1:
                                    try {
                                        jornada++;
                                        liga1.calcularJornada(jornada);
                                    } catch (NullPointerException exception) {
                                        System.out.println("\n"+"Error, debe crear una liga");
                                    }

                                    break;

                                case 2:
                                    liga1.consultarTabla();
                                    break;


                                default:
                            }
                        } while (eleccion2!=0);

                    } else {
                        System.out.println("\n"+"Debe crear una liga"+"\n");
                        break;
                    }

                    break;

                case 3:
                    if (existeLiga) {
                        System.out.println("\n"+"Seguro que quiere borrar la mejor liga de la historia ("+liga1.getNombreLiga()+")?"+" Escriba Si o No");
                        String decision = guardar.next();

                        if (decision.contains("Si")) {
                            liga1 = null;
                            existeLiga = false;
                            jornada = 1;
                            System.out.println("\n"+"Liga borrada"+"\n");
                            break;

                        } else {
                            System.out.println("\n"+"Menos mal");
                        }
                    }
                    System.out.println("\n"+"No existe ninguna liga"+"\n");

                    break;


                default:

            }
        } while (eleccion!=0);

    }
}
