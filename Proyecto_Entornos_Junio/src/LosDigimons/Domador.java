package LosDigimons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Pruebas_digimons.Digimons;

	public class Domador {
	    private String nombre;
	    private List<Digimon> equipo;

	    public Domador(String nombre) {
	        this.nombre = nombre;
	        this.equipo = new ArrayList<>();
	        this.equipo.add(new Digimon("Agumon"));
	        this.equipo.add(new Digimon("Gabumon"));
	        this.equipo.add(new Digimon("Patamon"));
}
	    // creacion de metodos
	    
	    public Digimon crearDigimonAleatorio() {
	        String[] nombres = {"Piyomon", "Tentomon", "Biyomon", "Palmon", "Gatomon", "Gomamon", "Tailmon"};
	        String nombreAleatorio = nombres[new Random().nextInt(nombres.length)];
	        return new Digimon(nombreAleatorio);
	    }

	    public void capturar(Digimon digimon) {
	        boolean enemigoYaEstaEnEquipo = equipo.contains(digimon);

	        if (!enemigoYaEstaEnEquipo && digimon.getPuntosSalud() <= 20) {
	            equipo.add(digimon);
	            System.out.println(digimon.getNombre() + " se ha unido a su equipo");
	        } else {
	            System.out.println("No se puede unir");
	        }
	    }

}