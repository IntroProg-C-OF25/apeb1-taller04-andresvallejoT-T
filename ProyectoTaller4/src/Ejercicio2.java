
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        double g1, g2, g3, total;

        Scanner pe = new Scanner(System.in);
        System.out.print("Escribir el gasto del primer hijo: ");
        g1 = pe.nextDouble();

        System.out.print("Escribe el gasto del segundo hijo: ");
        g2 = pe.nextDouble();

        System.out.print("Escribir el gasto del tercer hijo: ");
        g3 = pe.nextDouble();

        total = g1 + g2 + g3;

        System.out.println("el total de gasto entre los 3 hijos es: " + total);

    }
}
