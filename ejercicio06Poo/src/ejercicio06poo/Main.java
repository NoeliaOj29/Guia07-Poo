package ejercicio06poo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cafetera cafetera = new Cafetera(1000, 0);
        cafetera.llenarCafetera();
        System.out.println("LA CAFETERA SE HA LLENADO. ");
        System.out.println("Capacidad de la cafetera: " + cafetera.getcapacidadMaxima() + " ml");
        System.out.println("///Bienvenido/// PARA CONTINUAR ELIJA UNA OPCION DENTRO DEL MENU");
        System.out.println("Opcion 1- Servir taza");
        System.out.println("Opcion 2- Vaciar cafetera");
        System.out.println("Opcion 3- Agregar cafe");
        System.out.println("Opcion 4- Mostrar cuanto cafe hay en la cafetera");
        int opcion = read.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el tamaño de su tasa en ml");
                int tamañoTaza = read.nextInt();
                cafetera.servirTaza(tamañoTaza);
                break;
            case 2:
                cafetera.vaciarCafetera();
                break;
            case 3:
                System.out.println("Ingrese la cantidad de cafe que quiere agregar a la cafetera");
                int cantidadCafe = read.nextInt();
                cafetera.agregarCafe(cantidadCafe);
                break;
            case 4:
                cafetera.mostrarCantidadDeCafe();
                break;
            default:
                System.out.println("Opcion incorrecta");

        }
    }
}
