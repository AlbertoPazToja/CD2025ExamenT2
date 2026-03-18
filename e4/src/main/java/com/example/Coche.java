package com.example;

/**
 * Se crea la clase Coche con atributos marca, modelo (texto) y velocidad
 * (numero entero)
 */

public class Coche {

    private String marca;
    private String modelo;
    private int velocidad;

    /**
     * Método constructor para crear el objeto coche
     * 
     * @param marca  El nombre de la marca del coche
     * @param modelo El nombre del modelo del coche
     */
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    /**
     * Método que añade un valor a la variable velocidad
     * 
     * @param incremento El valor que le queremos añadir a la variable velocidad
     */
    public void acelerar(int incremento) {
        velocidad += incremento;
    }

    /**
     * Método que reduce el valor de velocidad
     * 
     * @param decremento El valor que queremos reducir de velodidad
     */
    public void frenar(int decremento) {
        velocidad -= decremento;
        if (velocidad < 0) {
            velocidad = 0;
        }
    }

    /**
     * Método que devuelve el valor de la variable velodidad
     * 
     * @return el valor de velodidad
     */
    public int getVelocidad() {
        return velocidad;
    }
}