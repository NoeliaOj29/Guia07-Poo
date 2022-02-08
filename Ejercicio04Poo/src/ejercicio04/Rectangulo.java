package ejercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    
    public void crearRectangulo() {
    Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();
        
    }
    
    public void calcularSuperficie() {
        System.out.println("La superficie del rectangulo es: " + (base * altura));
    }
    
    public void calcularPerimetro() {
        System.out.println("El perimetro del rectangulo es: " + ((base + altura)*2));
    }
    
    public void dibujarRectangulo() {
        System.out.println("////Grafico del Rectangulo////");
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" *");  
            }
            System.out.println();
        }
    }
}
