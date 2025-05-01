import java.util.Scanner;

public class VerificadorCaracteres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("Texto ingresado: " + cadena);
    }
}
