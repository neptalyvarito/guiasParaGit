package estoesgrupal;

import java.util.Scanner;

public class EstoEsGrupal {

    public static void main(String[] args) {

        String nombreCompleto = pedirDatos("Ingresa tu nombre: ") + " " + pedirDatos("Ingresa tu apellido: ");
        Integer opcion;
        System.out.print("\n");

        do {

            opcion = Integer.valueOf(pedirDatos("""
                                                Quieres saludar al mundo o a un pais?:
                                                1: Al mundo
                                                2: A un pais
                                                3: Salir
                                                > """));
            System.out.print("\n");

            switch (opcion) {
                case 1:
                    Saludo("Mundo", nombreCompleto);
                    break;
                case 2:
                    Saludo(pedirDatos("A que pais quiere saludar?: "), nombreCompleto);
                    break;
                case 3:
                    System.out.println("Adios. Lindo dia!!!");
                    break;
                default:
                    System.out.println("Ingrese una de las opciones mostradas!");
                    break;
            }
            System.out.print("\n");

        } while (opcion != 3);
    }

    private static void Saludo(String pais, String nombreCompleto) {
        System.out.println("\nHola " + pais + "!!! Espero que estes bien.");
        System.out.println("De parte de: " + nombreCompleto);
    }

    private static String pedirDatos(String datoPedir) {
        Scanner sc = new Scanner(System.in);
        System.out.print(datoPedir);
        String texto = sc.nextLine();
        return texto;
    }

}
