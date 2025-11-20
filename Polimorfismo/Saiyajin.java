package Polimorfismo;

public class Saiyajin extends Heroe {
    
    public Saiyajin(String nombre, int poder, int vida) {
        super(nombre, poder, vida);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre() + " lanza un ¡KAMEHAMEHA TRIPLE! ");
        
        // Hace triple daño
        int danio = getPoder() * 3;
        enemigo.setVida(enemigo.getVida() - danio);
        
        if (enemigo.getVida() < 0) {
            enemigo.setVida(0);
        }
        
        // Auto-daño
        setVida(getVida() - 15);
        if (getVida() < 0) {
            setVida(0);
        }
        
        System.out.println(getNombre() + " pierde 15 HP por el esfuerzo. Vida restante: " + getVida());
    }
}