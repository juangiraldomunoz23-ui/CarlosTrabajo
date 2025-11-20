package Polimorfismo;

public class Villano extends Personaje {
    
    public Villano(String nombre, int poder, int vida) {
        super(nombre, poder, vida);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre() + " lanza un ¡RAYO DE LA MUERTE! ");
        
        int danio = (int)(getPoder() * 1.5);  // Daño x1.5
        enemigo.setVida(enemigo.getVida() - danio);
        
        if (enemigo.getVida() < 0) {
            enemigo.setVida(0);
        }
    }
}
