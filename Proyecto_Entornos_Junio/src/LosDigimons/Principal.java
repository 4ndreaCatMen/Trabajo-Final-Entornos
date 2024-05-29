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

    }
    }