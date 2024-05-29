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

    // Nuevos métodos de ataque
    public int ataque3() {
        return 3 * puntosAtaque;
    }

    public int ataque4() {
        return 4 * puntosAtaque;
    }

    public int ataque5() {
        return 5 * puntosAtaque;
    }

    public int ataque6() {
        return 6 * puntosAtaque;
    }

    public int ataque7() {
        return 7 * puntosAtaque;
    }

    public int ataque8() {
        return 8 * puntosAtaque;
    }

    // Aqui los metodos get y un solo set para los puntos de salud porque necesita actualizarse cada vez que hay una batalla
    
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    public int getDp1() {
        return dp1;
    }

    public int getDp2() {
        return dp2;
    }
}

    
    
    
    
    
    
    
    
    
    
    


