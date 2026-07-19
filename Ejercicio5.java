
package ejercicio5;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double calificacion;
        System.out.println("Ingrese una calificación entre 0 y 10: ");
        calificacion=s.nextDouble();
        if (calificacion>=9 && calificacion <=10){
            System.out.println("EXCELENTE");
        }
        if (calificacion>=8 && calificacion <=8.99){
            System.out.println("MUY BUENO");
        }
        if (calificacion>=7 && calificacion <=7.99){
            System.out.println("BUENO");
        }
        if (calificacion>=5 && calificacion <=6.99){
            System.out.println("REGULAR");
        }    
        if (calificacion>=0 && calificacion <=4.99){
            System.out.println("DEFICIENTE");
        }
    }
}
