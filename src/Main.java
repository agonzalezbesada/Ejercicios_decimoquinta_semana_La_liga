import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);

        System.out.println("Qué desea hacer?"+"\n"+"1. Crear liga"+"\n"+"2. Jugar liga"+"\n"+"3. Salir");
        int eleccion = guardar.nextInt();

        switch(eleccion) {

            case 1:
                guardar.nextLine();
                System.out.println("\n"+"Elija un nombre para la liga");
                String nombre = guardar.nextLine();
                Liga liga1 = new Liga(nombre);


            break;


            case 2:
                liga1.jugarLiga();

            break;


            default:

        }
    }
}
