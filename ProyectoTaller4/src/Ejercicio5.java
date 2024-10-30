
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        double cpu, tecla, pant, raton, total;
        Scanner que = new Scanner(System.in);

        System.out.print("Escribir el costo del CPU: ");
        cpu = que.nextDouble();

        System.out.print("Escribir el costo del teclado: ");
        tecla = que.nextDouble();

        System.out.print("Escribir el costo de la pantalla: ");
        pant = que.nextDouble();

        System.out.print("Escribir el costo del raton");
        raton = que.nextDouble();

        total = cpu + tecla + pant + raton;

        System.out.println("El costo total es: " + total);

    }
}
