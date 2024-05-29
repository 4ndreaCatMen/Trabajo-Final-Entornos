package LosDigimons;

import java.util.Scanner;

/**
 * Clase que contiene el punto de entrada del programa y controla el flujo principal del juego.
 * Permite al jugador elegir un domador y sus acciones, como iniciar una batalla.
 * 
 * @author Andrea
 */

public class Principal {
	
    /**
     * Comienzo del programa.
     * 
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */

	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de nombres de domadores
        String[] nombresDomadores = {"Tai Yagami", "Yamato Ishida", "Sora Takenouchi", "Koshiro Izumi", "Mimi Tachikawa", "Joe Kido", "Takeru Takaishi", "Hikari Yamagi"};

        // Mostrar opciones de domadores y permitir al usuario elegir unx
        System.out.println("Escoge el domador/a que quieres usar:");
        for (int i = 0; i < nombresDomadores.length; i++) {
            System.out.println((i + 1) + ". " + nombresDomadores[i]);
        }
        int eleccionDomador = scanner.nextInt() - 1;

        // Crear el domador/a elegido
        Domador domador = new Domador(nombresDomadores[eleccionDomador]);
        
     // Menú principal
        while (true) {
            System.out.println("1. Iniciar batalla");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
            	
            	// Elige el Digimon antes de iniciar la batalla
            	
                Digimon digimonElegido = elegirDigimon(domador, scanner);
                BatallaDigital batalla = new BatallaDigital(domador, digimonElegido);
                batalla.pelea();
            } else if (opcion == 2) {
                break;
            } else {
                System.out.println("Error, prueba otra vez");
            }
        }

        scanner.close();
    }

    /**
     * Permite al jugador elegir un Digimon de su equipo para la batalla.
     * 
     * @param domador: El domador que posee el equipo de Digimons.
     * @param scanner: El objeto Scanner para la entrada del usuario.
     * @return El Digimon elegido por el jugador.
     */
    
    private static Digimon elegirDigimon(Domador domador, Scanner scanner) {
        System.out.println("Elige el Digimon que quieres usar:");
        for (int i = 0; i < domador.getEquipo().size(); i++) {
            Digimon digimon = domador.getEquipo().get(i);
            System.out.println((i + 1) + ". " + digimon.getNombre() + " (Nivel: " + digimon.getNivel() + ", Salud: " + digimon.getPuntosSalud() + ", DP1: " + digimon.getDp1() + ", DP2: " + digimon.getDp2() + ")");
        }
        int eleccion = scanner.nextInt() - 1;
        return domador.getEquipo().get(eleccion);
    }

  }
    