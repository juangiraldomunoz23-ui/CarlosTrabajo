public class PlatoComida extends ItemMenu {

    private boolean esVegetariano;

    public PlatoComida(String id, String nombre, double precio, boolean esVegetariano) {
        super(id,nombre,precio);
        this.esVegetariano = esVegetariano;
    }

    public boolean getEsVegetariano() {
        return esVegetariano;
    }
    public void setEsVegetariano(boolean esVegetariano) {
        this.esVegetariano = esVegetariano;
    }

    @Override
    public String obtenerDetalles() {
        // TODO Auto-generated method stub

        String resultado = super.obtenerDetalles();
        if(esVegetariano){
            resultado += " Es vegetariano";
        }else{
            resultado += " No es vegetariano";
        }

        return resultado;

    }
    
}
