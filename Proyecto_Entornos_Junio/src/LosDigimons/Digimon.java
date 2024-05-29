package LosDigimons;

import java.util.Random;

public class Digimon {
    private String nombre;
    private int nivel;
    private int puntosAtaque;
    private int puntosSalud;
    private int dp1;
    private int dp2;

    public Digimon(String nombre) {
        this.nombre = nombre;
        this.nivel = new Random().nextInt(5) + 1;
        this.puntosAtaque = 5 * this.nivel;
        this.puntosSalud = 10 * this.nivel;
        this.dp1 = 10;
        this.dp2 = 10;
    }

    public int ataque1() {
        if (dp1 > 0) {
            dp1--;
            return puntosAtaque;
        }
        return 0;
    }

    public int ataque2() {
        if (dp2 > 0) {
            dp2 -= 2;
            return 2 * puntosAtaque;
        }
        return 0;
    }
}

