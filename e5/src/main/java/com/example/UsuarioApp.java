package com.example;

/**
 * Clase UsuarioApp, con atributos de nombre (String), email (String) y edad
 * (int).
 */
public class UsuarioApp {
    private String nombre;
    private String email;
    private int edad;

    /**
     *
     * @param nombre Indica el nombre del usuario.
     * @param email  Indica la dirección del correo electrónico del usuario.
     * @param edad   Indica la edad del usuario.
     */
    public UsuarioApp(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    /**
     *
     * @return false si el nombre no está entre comillas, si el email no contiene
     *         "@" o si la edad es menor que cero.
     */
    public boolean validar() {
        if (nombre == null || "".equals(nombre)) {
            return false;
        }
        if (email == null || !email.contains("@")) {
            return false;
        }
        if (edad < 0) {
            return false;
        }
        return true;
    }

    public void mostrar() {
        System.out.println("Usuario: " + nombre + " Email:" + email + " Edad:" + edad);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    /**
     * Método probar, que contiene 3 variables int, y revisa si "x" o "y" es el
     * menor y si "x" es menor que "z".
     */
    public void probar() {
        int x = 1;
        int y = 2;
        int z = 2;

        if (x < y) {
            System.out.println("x menor");
        }
        if (y < z) {
            System.out.println("y menor");
        }
        if (x < z) {
            System.out.println("todo correcto");
        } else {
            System.out.println("error");
        }
    }

}
