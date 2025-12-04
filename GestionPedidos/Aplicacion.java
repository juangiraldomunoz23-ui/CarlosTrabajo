package GestionPedidos;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        
        GestorPedidos pedido = new GestorPedidos();

        PlatoComidad platocomida1 = new PlatoComidad("23", "Espaguetis a la boloñesa", 2000, false);

        PlatoComidad platocomida2 = new PlatoComidad("11", "Ensalada de Frutas", 1500, true);

        Bebida bebida1 = new Bebida("2", "CocaCola", 800, 600);

        Bebida bebida2 = new Bebida("1", "Soda", 600, 1200);

        pedido.agregarItem(platocomida1);
        pedido.agregarItem(platocomida2);
        pedido.agregarItem(bebida1);
        pedido.agregarItem(bebida2);

        double precioTotal = 0;

        for (int i = 0; i < pedido.getPedido().size(); i++) {
            pedido.getPedido().get(i).obtenerDetalles();
            precioTotal += pedido.getPedido().get(i).getPrecio();
        }

        System.out.println("Precio total= " + precioTotal);

        
    }
    
}
