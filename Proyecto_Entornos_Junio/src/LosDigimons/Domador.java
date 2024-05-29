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
}