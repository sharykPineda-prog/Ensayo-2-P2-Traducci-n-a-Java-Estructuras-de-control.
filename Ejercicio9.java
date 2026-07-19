
package ejercicio9;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num=s.nextInt();
        System.out.println("Tabla de multiplicar del " + num);
        for (int i=1; i<=12; i++) {
            System.out.println(num+"x"+i+"="+(num*i));
        }
    }
}
