import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);

        Liga liga1 = null;
        boolean existeLiga = false;
        int eleccion = 0;

        do {

            System.out.println("Qué desea hacer?"+"\n"+"1. Crear liga"+"\n"+"2. Jugar liga"+"\n"+"3. Salir");
            eleccion = guardar.nextInt();

            switch(eleccion) {

                case 1:
                    guardar.nextLine();
                    System.out.println("\n"+"Elija un nombre para la liga");
                    String nombre = guardar.nextLine();
                    liga1 = new Liga(nombre);
                    existeLiga = true;

                    break;

                case 2:

                    if (existeLiga) {
                        liga1.jugarLiga();
                    } else {
                        System.out.println("\n"+"Debe crear una liga"+"\n");
                        break;
                    }

                    break;


                default:

            }
        } while (eleccion!=0);

    }
}
