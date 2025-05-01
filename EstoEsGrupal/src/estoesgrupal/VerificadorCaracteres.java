package estoesgrupal;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

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
	
	Map<Character, Integer> especialesMap = new HashMap<>();

	for (int i = 0; i < cadena.length(); i++) {
    		char c = cadena.charAt(i);
    		if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
        		especialesMap.put(c, especialesMap.getOrDefault(c, 0) + 1);
    		}
	}

	System.out.println("Detalle de caracteres especiales:");
	for (Map.Entry<Character, Integer> entry : especialesMap.entrySet()) {
    		System.out.println("'" + entry.getKey() + "' aparece " + entry.getValue() + " vez/veces");
	}
    }
}

