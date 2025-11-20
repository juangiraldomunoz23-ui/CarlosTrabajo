package Polimorfismo;

public class Personaje {
    private String nombre;
    private int poder;
    private int vida;

    public Personaje (String nombre, int poder , int vida){ 
        this.nombre = nombre;
        this.poder = poder;
        this.vida = vida;

    }

    public void atacar (Personaje enemigo){
        System.out.println(nombre + " ataca con un golpe basico ");
        enemigo.vida -= poder;
        if (enemigo.vida <=0)enemigo.vida = 0;   
    }

    public void mostrarEstado(){
    System.out.println(nombre+ " tiene "+vida+ " puntos de vida restantes.");
    }
    public boolean estaVivito(){
    boolean estaVivito = true;
    if (vida > 0) {
        estaVivito = true;    
    
    }else{
      estaVivito = false;
    }
    return estaVivito ;
    
    }
     public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre ){
        this.nombre = nombre;
    }
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        if (vida >= 0) {
            this.vida = vida;
        }else{
            this.vida = 0;
        }
    }
    public int getPoder(){
        return poder;
    }
    public void setPoder(int poder){
        if (poder >= 0) {
            this.poder = poder;          
        }
    }

}
