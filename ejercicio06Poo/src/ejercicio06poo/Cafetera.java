package ejercicio06poo;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getcapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int tamañoTaza) {
        int servir = tamañoTaza;
        if (servir>cantidadActual) {
            servir = cantidadActual;
            System.out.println("La taza no ha sido llenada. Se ha servido: " + servir + " ml");
            System.out.println("Sobro " + (tamañoTaza-servir) + " ml");
        }else{
            System.out.println("La taza ha sido llenada.");
        }

    }
    
    public void vaciarCafetera() {
        cantidadActual = 0;
    }
    
    public void agregarCafe(int cantidadCafe) {
        if (cantidadActual==capacidadMaxima) {
            System.out.println("No se puede agregar mas cafe, la cafetera ya ha alcanzado su capacidad maxima.");
            
        }else{
            cantidadActual+=cantidadCafe;
            
        }
    
    }
    
    public void mostrarCantidadDeCafe() {
        System.out.println("En la cafetera hay " + cantidadActual + "ml de cafe");
    }
 
}
