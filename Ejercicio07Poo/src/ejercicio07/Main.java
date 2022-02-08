
package ejercicio07;

public class Main {

    public static void main(String[] args) {
        /*Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.*/
       Persona persona1 = new Persona("Carla", 33, 'F', 56, 1.65);
        Persona persona2 = new Persona("Lorena", 12, 'F', 40, 1.60);
        Persona persona3 = new Persona("Manuel", 25, 'M', 75, 1.75);
        Persona persona4 = new Persona("Miguel", 13, 'M', 60, 1.65);

        persona1.crearPersona();
        persona2.crearPersona();
        persona3.crearPersona();
        persona4.crearPersona();
        
        persona1.calcularIMC();
        persona2.calcularIMC();
        persona3.calcularIMC();
        persona4.calcularIMC();
        
        persona1.esMayorDeEdad();
        persona2.esMayorDeEdad();
        persona3.esMayorDeEdad();
        persona4.esMayorDeEdad();
    }
    
   
    
}
