package com.example;

public class Prestamo {

    private int codigo;
    private String fecha;
    public Libro libro;
    public Usuario usuario;

    public Prestamo(int codigo, String fecha, Libro libro, Usuario usuario) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.libro = libro;
        this.usuario = usuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int calcularDuracion() {
        return 15;
    }

}
