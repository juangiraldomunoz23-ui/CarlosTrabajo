public class Bebida extends ItemMenu {
    
    private int volumenML;

    public Bebida(String id, String nombre, double precio, int volumenML) {
        super(id,nombre,precio);
        this.volumenML  =volumenML;
    }

    public int getVolumenML() {
        return volumenML;
    }
    public void setVolumenML(int volumenML) {
        this.volumenML = volumenML;
    }

    @Override
    public String obtenerDetalles() {
        // TODO Auto-generated method stub
        String resultado =  super.obtenerDetalles();
        resultado += " Bebida: " + volumenML + " ml";
        return resultado;
    }
}
