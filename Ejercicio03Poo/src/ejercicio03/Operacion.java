package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {

    private double num1;
    private double num2;

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum1() {

        return num1;
    }

    public void setnum2(double num2) {
        this.num2 = num2;
    }

    public double getNum2() {
        return num2;
    }

    public void crearOperacion() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un numero");
        num1 = entrada.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = entrada.nextInt();
    }

    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error! Uno de los numeros ingresados es cero.");
            return 0;
        } else {
            return num1 * num2;
        }
    }

    public double dividir() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error! Uno de los numeros ingresados es cero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
