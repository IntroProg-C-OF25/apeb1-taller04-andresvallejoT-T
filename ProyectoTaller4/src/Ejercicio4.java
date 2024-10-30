
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        double costm, cantm, valorpla;
        
        Scanner que = new Scanner(System.in);
        
        System.out.print("Escribir Costo por minuto; ");
        costm = que.nextDouble();
        
        System.out.print("Escribir la cantidad de minutos; ");
        cantm = que.nextDouble();
        
        valorpla = cantm * costm;
        
        System.out.println("El valor a pagar es: " + valorpla);          
        
    }
    
}
