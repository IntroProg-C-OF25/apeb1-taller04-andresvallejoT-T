
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        int edad;
        double netflix, youtube, dropbox, spotify, totalcon, totalsin;
        Scanner que = new Scanner(System.in);

        System.out.print("Escribir tu edad: ");
        edad = que.nextInt();

        System.out.print("Ingrese el costo que paga por neflix: ");
        netflix = que.nextDouble();

        System.out.print("Ingrese el costo que paga por youtube: ");
        youtube = que.nextDouble();

        System.out.print("Ingrese el costo que paga por dropbox: ");
        dropbox = que.nextDouble();

        System.out.print("Ingrese el costo que paga por spotify: ");
        spotify = que.nextDouble();

        totalsin = netflix + youtube + dropbox + spotify;
        totalcon = totalsin - (totalsin * 0.2);

        if (edad < 30) {
            System.out.println("El valor total es: " + totalcon);
        } else {
            System.out.println("El valor total es: " + totalsin);
        }
    }
}
