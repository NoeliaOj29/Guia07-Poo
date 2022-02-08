package ejercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        cuenta.crearCuenta();
        System.out.println("///BIENVENIDO////");
        System.out.println("Elija una opcion");
        System.out.println("Opcion 1- Ingresar dinero");
        System.out.println("Opcion 2- Retirar dinero");
        System.out.println("Opcion 3- Extraccion rapida");
        System.out.println("Opcion 4- Consultar saldo");
        System.out.println("Opcion 5- Consultar datos");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la cantidad de dinero a depositar");
                double ingreso = entrada.nextDouble();
                cuenta.ingresarDinero(ingreso);
                break;
            case 2:
                System.out.println("Ingrese la cantidad de dinero a retirar");
                double retiro = entrada.nextDouble();
                cuenta.retirarDinero(retiro);
                break;
            case 3:
                cuenta.extraccionRapida();
                break;
            case 4:
                cuenta.consultarSaldo();
                break;
            case 5:
                cuenta.consultarDatos();
                break;
            default:
                System.out.println("Opcion incorrecta");
                        

        }

        

    }

}
