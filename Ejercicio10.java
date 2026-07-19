
package ejercicio10;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num;
        int sum=0;
        double prom;
        System.out.println("Ingrese 10 números: ");
        for (int i=1; i<=10; i++) {
            num=s.nextInt();
            sum+= num;
        }
        prom=sum/10;
        System.out.println("------RESULTADO-----");
        System.out.println("La suma es: "+sum);
        System.out.println("El promedio es: "+prom);
    }
}
