
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        double ladoc, ladot, c, d, e, f;
        Scanner pe = new Scanner(System.in);

        System.out.print("Escribir el lado del cuadrado: ");
        ladoc = pe.nextDouble();

        System.out.print("Escribir la altura del triangulo o del rectangulo: ");
        ladot = pe.nextDouble();

        c = ladoc * ladoc;
        d = (ladoc * ladot / 2) * 3;
        e = ladoc * ladot;

        f = c + d + e;

        System.out.println("El area total es; " + f);

    }

}
