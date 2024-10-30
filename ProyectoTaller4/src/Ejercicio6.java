
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner que = new Scanner(System.in);
        double prestamo, interes, total, totalan;

        System.out.print("Escribe el monto del prestamo: ");
        prestamo = que.nextDouble();

        System.out.print("Escribir el interes mensual: ");
        interes = que.nextDouble();

        total = prestamo / 12 + (prestamo * (interes / 100));

        totalan = total * 12;

        System.out.println("El valor a pagar por mes " + total);
        System.out.println("El pago total al año es" + totalan);

    }
}
