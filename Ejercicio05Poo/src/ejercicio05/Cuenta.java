package ejercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {

    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getDni() {
        return dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void crearCuenta() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el numero de cuenta del cliente");
        numeroCuenta = entrada.nextInt();
        System.out.println("Ingrese el DNI del cliente");
        dni = entrada.nextLong();
        System.out.println("Ingrese saldo actual");
        saldoActual = entrada.nextDouble();
    }

    public void ingresarDinero(double ingreso) {
        saldoActual += ingreso;
    }

    public void retirarDinero(double retiro) {
        if (retiro > saldoActual) {
            saldoActual = 0;   
        } else {
            saldoActual -= retiro;  
        }
        
    }

    public void extraccionRapida() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la cantidad a retirar. (Recuerde que no podra sacar mas del 20% de su saldo actual)");
        double retiro = entrada.nextDouble();
        while (retiro > saldoActual * 0.2) {
            System.out.println("Error! solo puede sacar el 20% de su saldo actual");
            System.out.println("Ingrese la cantidad a retirar. (Recuerde que no podra sacar mas del 20% de su saldo actual)");
            retiro = entrada.nextDouble();
        }
        saldoActual -= retiro;
    }

    public void consultarSaldo() {
        System.out.println("Su saldo actual es: " + saldoActual);
    }

    public void consultarDatos() {
        System.out.println("/////Datos de la cuenta:////");
        System.out.println("El numero de cuenta es: " + numeroCuenta);
        System.out.println("El numero de DNI asociado es: " + dni);
        System.out.println("El saldo actual de la cuenta es: " + saldoActual);
    }

}
