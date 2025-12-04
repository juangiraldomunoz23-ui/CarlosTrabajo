public class MisPedidos {
    public static void main(String[] args) {
        GestorPedidos pedidos = new GestorPedidos(4);
        
        ItemMenu comida1 = new PlatoComida("01", "Frijoles", 5000,true);
        ItemMenu comida2 = new PlatoComida("02", "Lentejas", 6000, true);
        ItemMenu bebida1 = new Bebida("03", "Beer", 20000, 250);
        ItemMenu bebida2 = new Bebida("04", "Cafe", 3000, 50);

        pedidos.agregarItem(comida1);
        pedidos.agregarItem(comida2);
        pedidos.agregarItem(bebida1);
        pedidos.agregarItem(bebida2);

        double total = 0;

        for(int i = 0; i < pedidos.getPedido().length; i++){

            System.out.println(pedidos.getPedido()[i].obtenerDetalles());
            total +=pedidos.getPedido()[i].getPrecio();
        }
        System.out.println("Total: " + total);
    }
}
