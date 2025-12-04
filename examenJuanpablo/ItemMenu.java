public class ItemMenu {

    //id (String), nombre (String), precio (double).
    private String id;
    private String nombre;
    private double precio;

    public ItemMenu(String id, String nombre, double precio) {
        this.id=id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String obtenerDetalles(){
        String resultado = "ID: " + id + " Nombre: " + nombre + " Precio: " + precio;
        return resultado;

    }
}
