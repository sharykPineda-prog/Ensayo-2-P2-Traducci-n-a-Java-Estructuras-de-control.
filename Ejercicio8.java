
package ejercicio8;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String claveCorrecta= "java2026";
        String intento;
        do {
            System.out.println("Ingrese la contraseña: ");
            intento=s.nextLine();
            if(!intento.equals(claveCorrecta)){
                System.out.println("Contraseña Incorrecta, Intente otra vez");
            }
        } while (!intento.equals(claveCorrecta));
        System.out.println("Acceso concedido.");
    }
}
