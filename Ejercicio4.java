
package ejercicio4;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double nota;
        System.out.println("Ingrese la nota del estudiante: ");
        nota=s.nextDouble();
        
        if (nota>=7) {
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }
    }
}
