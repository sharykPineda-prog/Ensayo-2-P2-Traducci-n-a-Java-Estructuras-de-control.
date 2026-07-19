
package ejercicio6;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese un numero entre el 1 y el 7: ");
        opcion=s.nextInt();

        switch (opcion) {
            case 1: 
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("Invalido: Tiene que ser entre el 1 y el 7");
                break;
        }
    }
}
