import java.util.Scanner;

public class VerificadorCaracteres {

    public static void main(String[] args) {
	int letras = 0, numeros = 0, espacios = 0, especiales = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("Texto ingresado: " + cadena);

	for (int i = 0; i < cadena.length(); i++) {
    		char c = cadena.charAt(i);
    		if (Character.isLetter(c)) {
        		letras++;
    		} else if (Character.isDigit(c)) {
        		numeros++;
    		} else if (Character.isWhitespace(c)) {
        		espacios++;
    		} else {
        		especiales++;
    		}
	}

	System.out.println("Letras: " + letras);
	System.out.println("Números: " + numeros);
	System.out.println("Espacios: " + espacios);
	System.out.println("Caracteres especiales: " + especiales);
    }
}

