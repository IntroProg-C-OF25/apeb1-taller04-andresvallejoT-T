
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int numero, multiplo;
        Scanner si = new Scanner(System.in);

        System.out.print("Ingresar un numero entre el 2 y el 6: ");
        numero = si.nextInt();

        if (numero >= 2 && numero <= 6) {
            for (multiplo = 1; multiplo <= 10; multiplo++) {
                System.out.println(numero + "x" + multiplo + "=" + (numero * multiplo));
            }
        } else {
            System.out.println("El numero debe estar entre el 2 y el 6");
        }
    }

}
