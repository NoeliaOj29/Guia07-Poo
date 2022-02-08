package ejercicio09;

/*Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas.*/
public class Matematica {

    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /*Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor*/
    public double devolverMayor() {
        double mayor = Math.max(num1, num2);
        System.out.println("El mayor valor es: " + mayor);
        return mayor;
    }

    /*Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.*/
    public void calcularPotencia() {
        double redondeoNum1 = Math.round(num1 * 100.0) / 100;
        double redondeoNum2 = Math.round(num2 * 100.0) / 100; 
        System.out.println("La potencia del mayor valor es: " + Math.pow(Math.max(redondeoNum1, redondeoNum2), Math.min(redondeoNum1, redondeoNum2)));

    }
    
    /*Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
    
    public void calculaRaiz() {
        System.out.println("La raiz cuadrada del menor valor es: " + Math.sqrt(Math.abs(Math.min(num1, num2))));
    
    }

}
