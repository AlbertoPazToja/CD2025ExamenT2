package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase PedidoService con una lista de pedidos, número total de pedidos y el
 * nombre de la tienda.
 */
public class PedidoService {
    private List<String> pedidos = new ArrayList<String>();
    private int totalPedidos;
    private String nomeTienda = "MiTiendaOnline";

    public PedidoService() {
    }

    /**
     *
     * Método que crea objetos pedidos, se añade al ArrayList y se suma 1 al
     * contador.
     *
     * @param p representa cada nuevo pedido
     */
    public void crearPedido(String p) {
        if (p != null && !"".equals(p)) {
            pedidos.add(p);
            totalPedidos++;
        }
    }

    /**
     *
     * Método que borra un pedido del ArrayList y resta uno al contador de pedidos.
     *
     * @param p
     */
    public void borrarPedido(String p) {
        if (p == null) {
            return;
        }
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).equals(p)) {
                pedidos.remove(i);
                totalPedidos--;
                break;
            }
        }
    }

    /**
     *
     * @return true si el tamaño del arraylist es mayor que cero, y false si no.
     */
    public int hayPedidos() {

        return pedidos.size();
    }

    public int getTotalPedidos() {
        return totalPedidos;
    }

    /**
     * Metodo que muestra los pedidos por pantalla.
     */
    public void imprimirPedidos() {
        System.out.println(
                "Listado de pedidos: "
                        + nomeTienda);
        for (String p : pedidos) {
            System.out.println(p);
        }
    }

    public void reiniciar() {
        pedidos = new ArrayList<String>();
        totalPedidos = 0;
    }

    /**
     * Método que procesa los pedidos.
     */
    public void procesarPedidos() {
        int a = 1;
        int b = 2;
        int c = 2;

        if (a < b) {
            if (b < c) {
                System.out.println("ok");
            } else {
                System.out.println("mal");
            }
        }
    }

    public String getnomeTienda() {
        return nomeTienda;
    }

    public void setnomeTienda(String nomeTienda) {
        this.nomeTienda = nomeTienda;
    }

}
