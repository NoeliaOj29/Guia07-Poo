package ejercicio12;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date)*/
public class Persona {

    private String nombre;
    private Date fechaNac;

    public Persona() {  //constructor vacío 
    }

    public Persona(String nombre, Date fechaNac) { //constructor parametrizado
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    //get & set methods
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    /*Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.*/
    public void crearPersona() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int anio, mes, dia;
        Date fechaActual = new Date();
        System.out.println("Ingrese el nombre");
        nombre = read.next();
        System.out.println("Ingrese el año de nacimiento");
        anio = read.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        mes = read.nextInt();
        System.out.println("Ingreese el dia de nacimiento");
        dia = read.nextInt();
        fechaNac = new Date(anio, mes, dia);
        System.out.printf("La fecha de nacimiento ingresada es %d/%d/%d \n", fechaNac.getDate(), fechaNac.getMonth(), fechaNac.getYear());
    }

    /*Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
 Tener en cuenta que para conocer la edad de la persona también se debe
 conocer la fecha actual.*/
    public void calcularEdad() {
        Date fechaActual = new Date();
         int edad=(int)(((fechaActual.getTime()-this.fechaNac.getTime())/3.154E+10)+1900+1);
        System.out.println("La edad de la persona ingresada es " + edad + " años");

    }
    
    /*Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.*/
    
    public boolean menorQue(int edad) {
        Date fechaActual=new Date();
        return edad>(int)(((fechaActual.getTime()-this.fechaNac.getTime())/3.154E+10)+1900+1);
    
    }
    
    /*Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
    
    public void mostrarPersona() {
        System.out.println("//Datos de la persona//");
        System.out.println("Nombre= " + nombre);
        System.out.printf("Fecha de nacimiento: %d/%d/%d \n",fechaNac.getDate(),fechaNac.getMonth(),fechaNac.getYear());
        
    
    }
 
}
