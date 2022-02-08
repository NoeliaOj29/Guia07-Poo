package Ejercicio1;


import java.util.Locale;
import java.util.Scanner;

public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numeroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
 
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void cargarLibro() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el ISBN");
        this.isbn = entrada.nextInt();
        this.titulo = entrada.next();
        this.autor = entrada.next();
        this.numeroDePaginas = entrada.nextInt();
    }

    public void mostrarLibro() {
        System.out.println("El ISBN es: " + isbn);
        System.out.println("El titulo es: " + titulo);
        System.out.println("El autor es: " + autor);
        System.out.println("El numeroDePaginas es: " + numeroDePaginas);
    }
}
