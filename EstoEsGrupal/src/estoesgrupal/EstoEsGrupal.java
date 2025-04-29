package estoesgrupal;

import java.util.Scanner;

public class EstoEsGrupal {

    public static void main(String[] args) {

        textoSubrayado(" PROGRAMA PARA SALUDOS");
        String nombreCompleto = pedirDatos("Ingresa tu nombre: ") + " " + pedirDatos("Ingresa tu apellido: ");
        Integer opcion;

        do {

            textoSubrayado("""
                    Quieres saludar al mundo o a un pais?:
                    1: Al mundo
                    2: A un pais
                    3: Salir""");
            opcion = Integer.valueOf(pedirDatos("> "));
            System.out.println("-------------------------");

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

        } while (opcion != 3);
    }

    private static void textoSubrayado(String texto) {
        System.out.println("-----------------------");
        System.out.println(texto);
        System.out.println("-----------------------");
    }

    private static void Saludo(String pais, String nombreCompleto) {
        System.out.println("Hola " + pais + "!!! Espero que estes bien.");
        System.out.println("De parte de: " + nombreCompleto);
    }

    private static String pedirDatos(String datoPedir) {
        Scanner sc = new Scanner(System.in);
        System.out.print(datoPedir);
        String texto = sc.nextLine();
        return texto;
    }

}
