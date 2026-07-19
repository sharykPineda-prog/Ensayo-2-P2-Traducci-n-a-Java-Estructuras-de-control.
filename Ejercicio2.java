
package ejercicio2;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer número: ");
        num1=s.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2=s.nextInt();
        
        int sum=num1+num2;
        int resta=num1-num2;
        int multi=num1*num2;
        
        System.out.println("------RESULTADOS------");
        System.out.println("La suma es: " +sum);
        System.out.println("La resta es: " +resta);
        System.out.println("La multiplicacción es: " +multi);
        
        if (num2 !=0) {
            double divi=(double) num1/num2;
            int residuo= num1 % num2;
            System.out.println("La división es: " +divi);
            System.out.println("El residuo es: " +residuo);
        } else {
            System.out.println("División: No se puede dividir para cero.");
            System.out.println("Residuo: No se puede calcular");
        }
    }
    
}
