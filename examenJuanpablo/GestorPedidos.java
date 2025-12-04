public class GestorPedidos {
    private ItemMenu[] pedido; 
    private int numeroActual;
    private int tamañoPedido;

    public GestorPedidos(int tamañoPedido) {
        this.tamañoPedido = tamañoPedido;
        pedido = new ItemMenu[tamañoPedido];
        numeroActual = 0;
    }

    public void agregarItem(ItemMenu item){

        pedido[numeroActual] = item;
        numeroActual += 1;
    }

    public ItemMenu[] getPedido() {
        return pedido;
    }
    
}
