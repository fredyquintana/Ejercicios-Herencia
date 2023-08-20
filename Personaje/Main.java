package Personaje;

public class Main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador("Aragorn", 10, "Guerrero");
        Enemigo enemigo = new Enemigo("Orco Grun", 5, "Orco");

        jugador.atacar();
        jugador.usarHabilidadEspecial();

        enemigo.atacar();
        enemigo.gritar();
    }
}

