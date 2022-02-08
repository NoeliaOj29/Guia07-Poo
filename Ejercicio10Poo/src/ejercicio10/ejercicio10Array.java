package ejercicio10;

import java.util.Arrays;

public class ejercicio10Array {

    /*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.*/
    public static void main(String[] args) {
        double[] arregloA = new double[50];

        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (double) Math.random() * 100 + 1; //rellenamos el arreglo A con numeros aleatorios
        }

        System.out.println("//Arreglo A// \n" + Arrays.toString(arregloA));//se muestra el arreglo A

        Arrays.sort(arregloA); //ordenamos el arreglo A
        System.out.println("//Arreglo A ordenado// \n" + Arrays.toString(arregloA)); //mostramos el arreglo A ordenado

        double[] arregloB = Arrays.copyOfRange(arregloA, 0, 20); //inicializamos el arreglo B y asignamos una copia de los primeros
                                                                //10 números del arreglo A a los primeros 10 elementos del arreglo B
        Arrays.fill(arregloB, 10, 20, 0.5);                     //y a los 10 restantes elementos le asigamos el valor 0.5

        System.out.println("//Arreglo B, combinado// \n" + Arrays.toString(arregloB)); // mostramos el arreglo B
    }

}
