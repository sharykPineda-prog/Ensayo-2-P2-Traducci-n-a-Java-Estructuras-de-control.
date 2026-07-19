
package ejercicio11;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Ingrese 10 números: ");
        System.out.println("Número 1: ");
        int num=s.nextInt();
        int mayor= num;
        int menor= num;
        
        for (int i=2; i<=10; i++) {
            System.out.println("Número " +i+ ":");
            num=s.nextInt();
            
            if (num> mayor) {
                mayor=num;
            }
            if (num<menor) {
                menor= num;
            }
        }
        System.out.println("-----RESULTADOS-----");
        System.out.println("Número mayor: " +mayor);
        System.out.println("Número menor: " +menor);
    }
}
