package com.example;

/**
 * Clase libro con los atributos titulo, autor (cadenas de texto) y paginas
 * (numero entero).
 */
public class Libro {

    private String titulo;
    private String autor;
    private int paginas;

    /**
     * Método constructor para crear el objeto libro.
     * 
     * @param titulo  el nombre de la obra.
     * @param autor   el nombre del autor.
     * @param paginas el número de páginas.
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /**
     * Método que devuelve el número de páginas si son más de 300.
     * 
     * @return el valor de páginas si son más de 300.
     */
    public boolean esLargo() {
        return paginas > 300;
    }

    /**
     * Método que muestra el título del libro.
     * 
     * @return el valor del atributo libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método que muestra el autor del libro.
     * 
     * @return el valor del atributo autor.
     */
    public String getAutor() {
        return autor;
    }
}