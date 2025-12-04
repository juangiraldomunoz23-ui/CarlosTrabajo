package GestionPedidos;

public class Bebida extends ItemMenu {

    private int volumenML;

    public Bebida (String id, String nombre, double precio, int volumenML){
        super (id, nombre, precio);
        this.volumenML = volumenML;
    }

    @Override
    public void obtenerDetalles(){
        super.obtenerDetalles();
        System.out.println("usted aumento su bebeida a: "+volumenML);
    }
    
}
