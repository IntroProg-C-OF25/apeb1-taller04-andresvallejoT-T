
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int uno, dos, tres;
        Scanner si = new Scanner(System.in);
        
        System.out.print("Escriba el primer valor: ");
        uno = si.nextInt();
        
        System.out.print("Escriba el segundo vaor: ");
        dos = si.nextInt();
        
        tres = uno * dos;
        
        System.out.println("el resultado es: " + tres);
    
    }
}
