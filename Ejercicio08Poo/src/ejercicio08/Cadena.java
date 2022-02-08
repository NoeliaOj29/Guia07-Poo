package ejercicio08;

/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud.*/
public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.*/
    public void mostrarVocales() {
        int cantidadVocales = 0;
        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.toLowerCase().charAt(i) == 'a'
                    || this.frase.toLowerCase().charAt(i) == 'e'
                    || this.frase.toLowerCase().charAt(i) == 'i'
                    || this.frase.toLowerCase().charAt(i) == 'o'
                    || this.frase.toLowerCase().charAt(i) == 'u') {
                cantidadVocales++;
            }

        }

        System.out.printf("\nLa cantidad de vocales que contiene *%s* es *%d*\n\n", this.frase, cantidadVocales);

    }

    /*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrase() {
        String fraseInvertida = "";
        for (int i = this.longitud - 1; i >= 0; i--) {
            fraseInvertida = fraseInvertida.concat(frase.substring(i, i + 1));

        }

        System.out.println("La frase invertida es: " + fraseInvertida);
    }

    /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizará cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(String letra) {
        int cantVecesRepet = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                cantVecesRepet++;
            }
        }
        System.out.println("La letra " + letra + " se repite " + cantVecesRepet + " veces");

    }

    /*Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(String frase) {
        if (this.longitud == frase.length()) {
            System.out.println("Ambas frases tienen la misma longitud");
        } else if (this.longitud > frase.length()) {
            System.out.printf("La frase *%s* es mas larga que *%s*\n", this.frase, frase);
        } else {
            System.out.printf("La frase *%s* es mas larga que *%s*\n", frase, this.frase);
        }

    }

    /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrases(String frase) {
        String concatenacion = this.frase.concat(", ".concat(frase));
        System.out.println("La nueva frase es: " + concatenacion);
    }

    /*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.*/
    public void reemplazar(String letra) {
        String fraseResultante = this.frase.replace("a", "" + letra.charAt(0));

        System.out.printf("La frase ahora es *%s*\n", fraseResultante);

    }

    /*Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    public boolean contiene(String letra) {
        
            return this.frase.contains(letra.substring(0, 1));
    }

}
