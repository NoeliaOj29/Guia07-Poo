
package ejercicio09;

/*En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set.*/

public class Main {

    public static void main(String[] args) {
       Matematica operaciones = new Matematica();
       operaciones.setNum1(Math.random());
       operaciones.setNum2(Math.random());
       operaciones.devolverMayor();
       operaciones.calcularPotencia();
       operaciones.calculaRaiz();
    }
    
}
