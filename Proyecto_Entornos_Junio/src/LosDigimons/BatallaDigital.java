package LosDigimons;
import java.util.List;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class BatallaDigital {
    private Domador domador;
    private Digimon digimonElegido;
    private Digimon enemigo;

    public BatallaDigital(Domador domador, Digimon digimonElegido) {
        this.domador = domador;
        this.digimonElegido = digimonElegido;
        this.enemigo = domador.crearDigimonAleatorio();
    }

    public void pelea() {
        Scanner scanner = new Scanner(System.in);
        int decision = 0;
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
                case 1:
                    dano = digimonElegido.ataque1();
                    System.out.println(digimonElegido.getNombre() + " realiza Llamarada Bebé causando " + dano + " puntos de dano.");
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
            enemigo.setPuntosSalud(Math.max(enemigo.getPuntosSalud() - dano, 0)); // Asegura que la salud no sea negativa

            System.out.println("La salud del enemigo " + enemigo.getNombre() + " es ahora " + enemigo.getPuntosSalud() + ".");
// El enemigo ha sido derrotado si la salud llega a 0
            if (enemigo.getPuntosSalud() <= 0) {
                
                if (enemigo.getPuntosSalud() <= 20) {
                    System.out.println("Has derrotado a " + enemigo.getNombre() + "!");
                    return; // Salir de la batalla si se captura
                } else {
                    System.out.println("Has derrotado a " + enemigo.getNombre() + "!");
                    return; // Salir de la batalla si el enemigo ha sido derrotado
                }
            } else {
                // Opciones para continuar la batalla
                System.out.println("Que quieres hacer ahora?");
                System.out.println("1. Atacar de nuevo");
                System.out.println("2. Intentar capturar");

                // Si se pulsa un numero que no es ni el 1 ni 2 se muestra el mensaje de error
                while (true) {
                    decision = scanner.nextInt();
                    if (decision == 1 || decision == 2) {
                        break; // Salir del bucle si la entrada es válida
                    } else {
                        System.out.println("Error, prueba otra vez"); // Mensaje de error si la entrada no es válida
                        scanner.nextLine(); 
                }
// cuando la salud es mayor a 20 aunque te de la posibilidad no se podra capturar
                if (decision == 2) {
                    if (enemigo.getPuntosSalud() <= 20) {
                        domador.capturar(enemigo);
                        return; // Salir de la batalla si se captura
                    } else {
                        System.out.println("No se puede unir");
                    }
                } else {
                    System.out.println("Has derrotado a " + enemigo.getNombre() + "!");
                    return; // Salir de la batalla si el enemigo ha sido derrotado
                }
            }
        }
    }

}
