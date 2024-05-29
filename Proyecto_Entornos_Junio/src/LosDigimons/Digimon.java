package LosDigimons;

import java.util.Random;

/**
 * Clase Digimon.
 * Aqui se crean y gestionan las características de un Digimon.
 *
 * @author Andrea
 */

public class Digimon {
    private String nombre; // El nombre del Digimon
    private int nivel; // El nivel del Digimon
    private int puntosAtaque; // Los puntos de ataque del Digimon
    private int puntosSalud; // Los puntos de salud del Digimon
    private int dp1; // Puntos de disponibilidad para el ataque 1 del Digimon
    private int dp2; // Puntos de disponibilidad para el ataque 2 del Digimon

    /**
     * Constructor de la clase Digimon.
     *
     * @param nombres de los digimon que se muestran junto con sus valores.
     */
    
    public Digimon(String nombre) {
        this.nombre = nombre; 
        this.nivel = new Random().nextInt(5) + 1;  // Se le asigna un nivel aleatorio entre 1 y 5
        this.puntosAtaque = 5 * this.nivel;  // para calcular los puntos de ataque basados en el nivel
        this.puntosSalud = 10 * this.nivel; // para calcular los puntos de salud basados en el nivel
        this.dp1 = 10; //son los puntos disponibles con los que se inicia la partida 
        this.dp2 = 10; //son los puntos disponibles con los que se inicia la partida
    }

    /**
     * Realiza el ataque 1 del Digimon.
     *
     * @return El daño causado por el ataque 1, o 0 si el ataque no está disponible.
     */
    
    public int ataque1() {
        if (dp1 > 0) {
            dp1--;
            return puntosAtaque;
        }
        return 0;
    }

    /**
    * Realiza el ataque 2 del Digimon.
    *
    * @return El daño causado por el ataque 2, o 0 si el ataque no está disponible.
    */
    
    public int ataque2() {
        if (dp2 > 0) {
            dp2 -= 2;
            return 2 * puntosAtaque;
        }
        return 0;
    }

    // Nuevos métodos de ataque adicionales
    
    /**
     * Realiza el ataque 3 del Digimon.
     *
     * @return El daño causado por el ataque 3.
     */ 
    
    public int ataque3() {
        return 3 * puntosAtaque;
    }

    /**
     * Realiza el ataque 4 del Digimon.
     *
     * @return El daño causado por el ataque 4.
     */
    
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
    
    /**
     * Obtiene el nombre del Digimon.
     *
     * @return El nombre del Digimon.
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el nivel del Digimon.
     *
     * @return El nivel del Digimon.
     */
    
    public int getNivel() {
        return nivel;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    /**
     * Establece los puntos de salud del Digimon.
     *
     * @param puntosSalud Los nuevos puntos de salud del Digimon.
     */
    
    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    /**
     * Obtiene los puntos de disponibilidad para el ataque 1 del Digimon.
     *
     * @return Los puntos de disponibilidad para el ataque 1 del Digimon.
     */

    
    public int getDp1() {
        return dp1;
    }

    /**
     * Obtiene los puntos de disponibilidad para el ataque 2 del Digimon.
     *
     * @return Los puntos de disponibilidad para el ataque 2 del Digimon.
     */
    
    public int getDp2() {
        return dp2;
    }
}

    
    
    
    
    
    
    
    
    
    
    


