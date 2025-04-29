package estoesgrupal;

import java.util.Scanner;

public class EstoEsGrupal {

    private static final Scanner sc = new Scanner(System.in); // Instancia única de Scanner

    public static void main(String[] args) {

        textoSubrayado("PROGRAMA PARA SALUDOS");
        String nombreCompleto = pedirDatos("Ingresa tu nombre: ") + " " + pedirDatos("Ingresa tu apellido: ");
        Integer opcion;

        do {
            textoSubrayado(
                    "¿Quieres saludar al mundo o a un país?:\n" +
                            "1: Al mundo\n" +
                            "2: A un país\n" +
                            "3: Salir");

            try {
                opcion = Integer.parseInt(pedirDatos("> "));
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número válido.");
                opcion = -1;
                continue;
            }

            textoSubrayado("""
                    Quieres saludar al mundo o a un pais?:
                    1: Al mundo
                    2: A un pais
                    3: Salir""");
            opcion = Integer.valueOf(pedirDatos("> "));
            System.out.println("-------------------------");

            switch (opcion) {
                case 1:
                    saludo("Mundo", nombreCompleto);
                    break;
                case 2:
                    saludo(pedirDatos("¿A qué país quieres saludar?: "), nombreCompleto);
                    break;
                case 3:
                    System.out.println("Adiós. ¡Lindo día!");
                    break;
                default:
                    System.out.println("¡Ingresa una de las opciones mostradas!");
                    break;
            }

        } while (opcion != 3);

        sc.close(); // Cierra el Scanner al final
    }

    private static void textoSubrayado(String texto) {
        System.out.println("-----------------------");
        System.out.println(texto);
        System.out.println("-----------------------");
    }

    private static void saludo(String pais, String nombreCompleto) {
        System.out.println("¡Hola " + pais + "! Espero que estés bien.");
        System.out.println("De parte de: " + nombreCompleto);
    }

    private static String pedirDatos(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }
}
