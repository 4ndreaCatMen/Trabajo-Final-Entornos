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
            System.out.println("1. Llamarada Bebé");
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
                    System.out.println(digimonElegido.getNombre() + " realiza Llamarada Bebé causando " + dano + " puntos de daño.");
                    break;
                case 2:
                    dano = digimonElegido.ataque2();
                    System.out.println(digimonElegido.getNombre() + " realiza Destructor Azul causando " + dano + " puntos de daño.");
                    break;
                case 3:
                    dano = digimonElegido.ataque3();
                    System.out.println(digimonElegido.getNombre() + " realiza Burbuja Explosiva causando " + dano + " puntos de daño.");
                    break;
                case 4:
                    dano = digimonElegido.ataque4();
                    System.out.println(digimonElegido.getNombre() + " realiza Tornado de Fuego causando " + dano + " puntos de daño.");
                    break;
                case 5:
                    dano = digimonElegido.ataque5();
                    System.out.println(digimonElegido.getNombre() + " realiza Electroshocker causando " + dano + " puntos de daño.");
                    break;
                case 6:
                    dano = digimonElegido.ataque6();
                    System.out.println(digimonElegido.getNombre() + " realiza Hiedra Venenosa causando " + dano + " puntos de daño.");
                    break;
                case 7:
                    dano = digimonElegido.ataque7();
                    System.out.println(digimonElegido.getNombre() + " realiza Desfile de Peces causando " + dano + " puntos de daño.");
                    break;
                case 8:
                    dano = digimonElegido.ataque8();
                    System.out.println(digimonElegido.getNombre() + " realiza Garra Relampago causando " + dano + " puntos de daño.");
                    break;                default:
                    System.out.println("Opción no válida");
                    continue;
            }

}
