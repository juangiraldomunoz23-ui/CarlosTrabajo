package Polimorfismo;

public class Heroe extends Personaje{

    public Heroe(String nombre, int poder, int vida) {
        super(nombre, poder, vida);
    }
    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(getNombre() + " lanza un ¡KAMEHAMEHA! ");
        
        int danio = getPoder() * 2;
        enemigo.setVida(enemigo.getVida() - danio);
        
        if (enemigo.getVida() < 0) {
            enemigo.setVida(0);
        }
    }
}

