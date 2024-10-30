
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        double b, h, resultado;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribir la base del triangulo: ");
        b = teclado.nextDouble();

        System.out.print("Escribir la altura del triangulo; ");
        h = teclado.nextDouble();

        resultado = b * h / 2;

        System.out.println("El area total es: " + resultado);

    }
}
