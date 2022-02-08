package ejercicio03;

public class Main {

    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("El resultado de la suma es: " + operacion.sumar());
        System.out.println("El resultado de la resta es: " + operacion.restar());
        System.out.println("El resultado de la multiplicacion es: " + operacion.multiplicar());
        System.out.println("El resultado de la division es: " + operacion.dividir());
    }

}

