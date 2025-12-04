package GestionPedidos;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorPedidos{

    private ArrayList < ItemMenu > pedido;

    public GestorPedidos(){
        pedido = new ArrayList<>();
    }
    

    public ArrayList<ItemMenu> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<ItemMenu> pedido) {
        this.pedido = pedido;
    }


    public void agregarItem(ItemMenu item){
        pedido.add(item);
    }

        



            

 }

    

