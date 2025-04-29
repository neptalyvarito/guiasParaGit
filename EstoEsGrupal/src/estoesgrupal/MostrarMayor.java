package estoesgrupal;
import java.util.Scanner;

public class MostrarMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------");
        System.out.print("Ingrese n1: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese n2: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese n3: ");
        int n3 = sc.nextInt();
        System.out.println("--------------");

        System.out.println("Los números ingresados son : " + n1 + ", " + n2 + ", " +n3);

        int mayor = n1;
        if(n2>mayor){
            mayor = n2;
        }
        if(n3 > mayor){
            mayor = n3;
        }

        System.out.println("--------------");
        System.out.println("El mayor es: " + mayor);
        System.out.println("--------------");

    }
}
