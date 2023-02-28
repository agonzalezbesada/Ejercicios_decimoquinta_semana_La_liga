import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);

        Liga_futbol liga1 = null;
        boolean existeLiga = false;
        int eleccion = 0;

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
                                        liga1.calcularJornada();
                                    } catch (NullPointerException exception) {
                                        System.out.println("\n"+"Error, debe crear una liga");
                                    }

                                    break;

                                case 2:

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
                    liga1 = null;
                    existeLiga = false;
                    break;


                default:

            }
        } while (eleccion!=0);

    }
}
