package LosDigimons;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que simula una batalla digital entre un domador y un Digimon enemigo.
 * Controla el desarrollo de la pelea y permite al jugador seleccionar ataques.
 * 
 * @author Andrea
 */



public class BatallaDigital {
    private Domador domador; // El domador que participa en la batalla
    private Digimon digimonElegido; // El Digimon elegido por el domador para pelear
    private Digimon enemigo; // El Digimon enemigo que se enfrenta al digimon elegido por el domador/a

    /**
     * Constructor de la clase BatallaDigital.
     * 
     * @param domador El domador que participa en la batalla.
     * @param digimonElegido El Digimon elegido por el domador para pelear.
     */
    public BatallaDigital(Domador domador, Digimon digimonElegido) {
    	this.domador = domador; // Guardamos el domador que participa en la batalla
        this.digimonElegido = digimonElegido; // Guardamos el Digimon elegido por el domador
        this.enemigo = domador.crearDigimonAleatorio(); // Creamos un Digimon enemigo aleatorio para la batalla
    }

    /**
     * Simula el desarrollo de la batalla.
     */
    
    public void pelea() {
        Scanner scanner = new Scanner(System.in);
        int decision = 0;
        
        // Todas las opciones de ataque que he añadido porque he querido y son ataques de verdad de los Digimons

        while (enemigo.getPuntosSalud() > 0) {
            System.out.println("Elige un ataque:");
            System.out.println("1. Llamarada Baby");
            System.out.println("2. Destructor Azul");
            System.out.println("3. Burbuja Explosiva");
            System.out.println("4. Tornado de Fuego");
            System.out.println("5. Electroshocker");
            System.out.println("6. Hiedra Venenosa");
            System.out.println("7. Desfile de Peces");
            System.out.println("8. Garra Relampago");
            int accion = scanner.nextInt();

            int dano = 0;
            switch (accion) {
            
            // Se realiza un ataque dependiendo de la opción elegida por el usuario

                case 1:
                    dano = digimonElegido.ataque1();
                    System.out.println(digimonElegido.getNombre() + " realiza Llamarada Baby causando " + dano + " puntos de dano.");
                    break;
                case 2:
                    dano = digimonElegido.ataque2();
                    System.out.println(digimonElegido.getNombre() + " realiza Destructor Azul causando " + dano + " puntos de dano.");
                    break;
                case 3:
                    dano = digimonElegido.ataque3();
                    System.out.println(digimonElegido.getNombre() + " realiza Burbuja Explosiva causando " + dano + " puntos de dano.");
                    break;
                case 4:
                    dano = digimonElegido.ataque4();
                    System.out.println(digimonElegido.getNombre() + " realiza Tornado de Fuego causando " + dano + " puntos de dano.");
                    break;
                case 5:
                    dano = digimonElegido.ataque5();
                    System.out.println(digimonElegido.getNombre() + " realiza Electroshocker causando " + dano + " puntos de dano.");
                    break;
                case 6:
                    dano = digimonElegido.ataque6();
                    System.out.println(digimonElegido.getNombre() + " realiza Hiedra Venenosa causando " + dano + " puntos de dano.");
                    break;
                case 7:
                    dano = digimonElegido.ataque7();
                    System.out.println(digimonElegido.getNombre() + " realiza Desfile de Peces causando " + dano + " puntos de dano.");
                    break;
                case 8:
                    dano = digimonElegido.ataque8();
                    System.out.println(digimonElegido.getNombre() + " realiza Garra Relampago causando " + dano + " puntos de dano.");
                    break;                default:
                    System.out.println("Opcion no valida");
                    continue;
            }

            enemigo.setPuntosSalud(Math.max(enemigo.getPuntosSalud() - dano, 0)); // para que el daño causado no sea negativo, si la salud es 0 será derrotado

            System.out.println("La salud del enemigo " + enemigo.getNombre() + " es ahora " + enemigo.getPuntosSalud() + ".");

            if (enemigo.getPuntosSalud() <= 0) {
                // El enemigo ha sido derrotado
                if (enemigo.getPuntosSalud() <= 20) {
                    System.out.println("Has derrotado a " + enemigo.getNombre() + "!");
                    return; // En el caso de que el digimon sea capturado se vuelve a iniciar otra batalla
                } else {
                    System.out.println("Has derrotado a " + enemigo.getNombre() + "!");
                    return; // Si se derrota al digimon enemigo también se vuelve a iniciar otra batalla
                }
            } else {
            	
                // El enemigo sigue en la batalla, se muestra la opción para continuar
                System.out.println("Que quieres hacer ahora?");
                System.out.println("1. Atacar de nuevo");
                System.out.println("2. Intentar capturar");

                // bucle while para la comprobación de que la insercción del dato es la correcta
                while (true) {
                    decision = scanner.nextInt();
                    if (decision == 1 || decision == 2) {
                        break; // El bucle se rompe si se elige las opciones que se muestran por pantalla, es decir, 1 y 2
                    } else {
                        System.out.println("Error, prueba otra vez"); // De no cumplirse lo anterior de mostrará por pantalla ese mensaje
                        scanner.nextLine();
                    }
                }

             // Se realiza la acción según la decisión del usuario
                
                if (decision == 2) {
                    if (enemigo.getPuntosSalud() <= 20) {
                        domador.capturar(enemigo);
                        return; // Se sale de la batalla si se captura al enemigo
                    } else {
                        System.out.println("No se puede unir");
                    }
                } else {
                    System.out.println("Has derrotado a " + enemigo.getNombre() + "!");
                    return; // Se sale de la batalla si el enemigo es derrotado
                }
            }
        }
    }
}
