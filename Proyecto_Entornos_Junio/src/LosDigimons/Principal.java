package LosDigimons;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de nombres de domadores
        String[] nombresDomadores = {"Tai Yagami", "Yamato Ishida", "Sora Takenouchi", "Koshiro Izumi", "Mimi Tachikawa", "Joe Kido", "Takeru Takaishi", "Hikari Yamagi"};

        // Mostrar opciones de domadores y permitir al usuario elegir uno
        System.out.println("Escoge el domador/a que quieres usar:");
        for (int i = 0; i < nombresDomadores.length; i++) {
            System.out.println((i + 1) + ". " + nombresDomadores[i]);
        }
        int eleccionDomador = scanner.nextInt() - 1;

        // Crear el domador elegido
        Domador domador = new Domador(nombresDomadores[eleccionDomador]);
        
     // Menú principal
        while (true) {
            System.out.println("1. Iniciar batalla");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                
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
    