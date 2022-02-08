package ejercicio07;

import java.util.Locale;
import java.util.Scanner;

/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. */
public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() { //constructor por defecto
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) { //constructor con todos los atributos como parámetro
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Métodos getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /*Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje */
    //nombre edad sexo peso altura  
    public void crearPersona() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el nombre ");
        nombre = read.next();
        System.out.println("Ingrese la edad ");
        edad = read.nextInt();
        do {
            System.out.println("Ingrese el sexo (M = mujer, H = hombre, O = otro) ");
            sexo = read.next().toUpperCase().charAt(0);
            if (sexo != 'H' && sexo != 'M' && sexo != 'O') {
                System.out.println("Error! ha ingresado incorrectamente la letra correspondiente al sexo. Vuelva a intentar");
            }
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        System.out.println("Ingrese el peso ");
        peso = read.nextDouble();
        System.out.println("Ingrese la altura ");
        altura = read.nextDouble();

    }
     /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1. */

    public double calcularIMC() {
        double pesoIdeal = peso / (Math.pow(altura, 2));
        if (pesoIdeal < 20) {
            return -1;
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            return 0;
        } else {
            return 1;
        }

    }
    /*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
    
    public boolean esMayorDeEdad() {
        return edad>=18;
    
    }
    
    
    

}
