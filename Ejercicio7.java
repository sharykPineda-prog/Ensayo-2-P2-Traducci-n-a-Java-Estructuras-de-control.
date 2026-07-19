
package ejercicio7;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int contador= 0;
        double sum= 0;
        double num;
        System.out.println("Ingrese un número positivo (negativo finaliza el programa): ");
        num= s.nextDouble();
        while (num>=0) {
            sum+=num;
            contador++;
            System.out.println("Ingrese otro numero positivo: ");
            num= s.nextDouble();
        }
        System.out.println("Cantidad de numero ingresados: "+contador);
        System.out.println("Suma total: "+sum);
    }  
}
    

