package estoesgrupal;

import java.util.Scanner;

public class EstoEsGrupal {

    public static void main(String[] args) {

        String nombreCompleto = pedirDatos("Ingresa tu nombre: ") + " " + pedirDatos("Ingresa tu apellido: ");
        Integer opcion;
        System.out.print("\n");

        do {

            System.out.println("Quieres saludar al mundo o a un pais?: ");
            System.out.println("1: Al mundo");
            System.out.println("2: A un pais");
            System.out.println("3: A un pais");
            System.out.print("> ");
            Scanner sc = new Scanner(System.in);
            opcion = Integer.valueOf(sc.nextLine());
            System.out.print("\n");

            switch (opcion) {
                case 1:
                    System.out.println("Hola Mundo!!!!  Espero que estes bien.");
                    System.out.println("De parte de: " + nombreCompleto);
                    break;
                case 2:
                    System.out.print("A que pais quiere saludar?: ");
                    String pais = sc.nextLine();
                    System.out.println("\nHola " + pais + "!!! Espero que estes bien.");
                    System.out.println("De parte de: " + nombreCompleto);
                    break;
                case 3:
                    System.out.println("Adios. Lindo dia!!!");
                    break;
                default:
                    System.out.println("Ingrese una de las opciones mostradas!");
                    break;
            }
            System.out.println("");
            
        } while (opcion != 3);
    }

    private static String pedirDatos(String datoPedir) {
        Scanner sc = new Scanner(System.in);
        System.out.print(datoPedir);
        String texto = sc.nextLine();
        return texto;
    }

}
