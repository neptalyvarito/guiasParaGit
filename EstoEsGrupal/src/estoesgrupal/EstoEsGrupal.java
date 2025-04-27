
package estoesgrupal;

import java.util.Scanner;

public class EstoEsGrupal {

    public static void main(String[] args) {

        String nombre = pedirDatos("ingresa tu nombre: ");
        String apellido = pedirDatos("ingresa tu apellido: ");
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("Hola Mundo !!!!  espero que estes bien");
        System.out.println("De parte de: " + nombreCompleto);
    }

    private static String pedirDatos(String datoPedir) {
        Scanner sc = new Scanner(System.in);
        System.out.print(datoPedir);
        String texto = sc.nextLine();
        return texto;
    }

}
