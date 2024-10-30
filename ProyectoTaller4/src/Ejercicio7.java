
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        double costo, consumo, totalsin, totalcon;
        int edad;
        Scanner que = new Scanner(System.in);

        System.out.print("Ingesar su edad: ");
        edad = que.nextInt();
        System.out.print("Ingresar el valor de costo por kilovatio/horas: ");
        costo = que.nextDouble();
        System.out.print("Ingresar su consumo de kolovatios al mes: ");
        consumo = que.nextDouble();

        totalsin = costo * consumo;
        totalcon = totalsin - costo * consumo * 0.1;

        if (edad > 65) { //como dice mayor y no igual solo se puso mayor a 65 a si que si se ingresa 65 no existira el descuento
            System.out.println("El costo total es: " + totalcon);
        } else {
            System.out.println("el costo total es: " + totalsin);

        }
    }

}
