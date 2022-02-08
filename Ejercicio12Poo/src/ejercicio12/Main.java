
package ejercicio12;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.crearPersona();
        persona.calcularEdad();
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la edad para hacer la comparacion");
        int edad= read.nextInt();
        persona.menorQue(edad);
        persona.mostrarPersona();
    }
    
}
