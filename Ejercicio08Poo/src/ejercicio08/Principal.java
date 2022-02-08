package ejercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    /*En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada.*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cadena frase = new Cadena();
        System.out.println("Ingrese palabra o frase: ");
        frase.setFrase(entrada.next());
        frase.setLongitud(frase.getFrase().length());
        System.out.println("la longitud de la frase es: " + frase.getLongitud());
        
        frase.mostrarVocales();
        frase.invertirFrase();
        frase.vecesRepetido("a");
        frase.compararLongitud("hola");
        frase.unirFrases("esta es una frase");
        frase.reemplazar("i");
        frase.contiene("o");
        
    }
    
}
