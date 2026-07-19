
package ejercicio3;

import java.util.Scanner;


// @author Sharyk Esthefanía Pineda Maza
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad de una persona: ");
        edad=s.nextInt();
        if (edad>=18){
            System.out.println("Es mayor de edad");
        }
    }
    
}
