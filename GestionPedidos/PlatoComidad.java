package GestionPedidos;

public class PlatoComidad extends ItemMenu {

    private boolean esVegetariano;

    public PlatoComidad (String id, String nombre, double precio, boolean esVegetariano){
        super(id, nombre, precio);
        this.esVegetariano = esVegetariano;
    }
    
    @Override
    public void obtenerDetalles(){
        System.out.println("Su id es: "+getId());
        System.out.println("Su nombre es: "+getNombre());
        System.out.println("el precio es: "+getPrecio());
        System.out.println("usted es vegetariano: "+esVegetariano);
    }

}
