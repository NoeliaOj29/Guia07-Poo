package Ejercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void crearCircunferencia() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el radio");
        radio = entrada.nextDouble();
    }

    public void crearArea() {
        System.out.println("El area de la circunferencia es: " + (Math.PI * Math.pow(radio, 2)));

    }

    public void crearPerimetro() {
        System.out.println("El perimetro de la circunferencia es: " + (2 * Math.PI * radio));
    }

}
