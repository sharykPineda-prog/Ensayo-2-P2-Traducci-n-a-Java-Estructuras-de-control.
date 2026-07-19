
package ejercicio1;

import java.util.Scanner;

 //@author Sharyk Esthefanía Pineda Maza

public class Ejercicio1 {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
        String nom;
        int edad;
        String carrera;
        double estatura;
            System.out.println("Ingrese su nombre: ");
            nom=s.nextLine();
            System.out.println("Ingrese su edad: ");
            edad=s.nextInt();
            s.nextLine();
            System.out.println("Ingrese su carrera: ");
            carrera=s.nextLine();
            System.out.println("Ingrese su estatura: ");
            estatura=s.nextDouble();
            
            System.out.println("------SUS DATOS------");
            System.out.println("Su nombre es: " +nom);
            System.out.println("Su edad es: " +edad);
            System.out.println("Su carrera es: " +carrera);
            System.out.println("Su estatura es: " +estatura);
    }
}
