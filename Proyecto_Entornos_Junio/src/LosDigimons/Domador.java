package LosDigimons;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase que representa a un Domador de Digimons.
 * Permite crear y gestionar un equipo de Digimons.
 * 
 * @author Andrea
 */

//Aquí comienza la clase principal llamada Domador
public class Domador {
 // Aquí definimos las características principales del domador
 private String nombre; // El nombre del domador
 private List<Digimon> equipo; // La lista de Digimons que tiene en su equipo

 // Este es el constructor del Domador, que se ejecuta cuando creamos un nuevo Domador
 public Domador(String nombre) {
     this.nombre = nombre; // Guardamos el nombre del domador
     this.equipo = new ArrayList<>(); // Creamos una nueva lista vacía para su equipo
     // Añadimos algunos Digimons iniciales al equipo del domador
     this.equipo.add(new Digimon("Agumon"));
     this.equipo.add(new Digimon("Gabumon"));
     this.equipo.add(new Digimon("Patamon"));
 }

 /**
  * Crea un Digimon aleatorio.
  * 
  * @return Un Digimon con nombre aleatorio.
  */
 
 public Digimon crearDigimonAleatorio() {
     // Definimos algunos nombres de Digimons
     String[] nombres = {"Piyomon", "Tentomon", "Biyomon", "Palmon", "Gatomon", "Gomamon", "Tailmon"};
     // Elegimos uno de los nombres aleatoriamente
     String nombreAleatorio = nombres[new Random().nextInt(nombres.length)];
     // Creamos un nuevo Digimon con ese nombre
     return new Digimon(nombreAleatorio);
 }

 /**
  * Captura un Digimon y lo añade al equipo del domador si cumple ciertas condiciones.
  * 
  * @param digimon El Digimon a capturar.
  */
 
 public void capturar(Digimon digimon) {
     // Revisamos si el Digimon ya está en el equipo del domador
     boolean enemigoYaEstaEnEquipo = equipo.contains(digimon);

     // Si el Digimon no está en el equipo y tiene menos de 20 puntos de salud, lo añadimos al equipo
     if (!enemigoYaEstaEnEquipo && digimon.getPuntosSalud() <= 20) {
         equipo.add(digimon);
         System.out.println(digimon.getNombre() + " se ha unido a su equipo");
     } else {
         // Si no cumple con las condiciones anteriores, no se puede unir al equipo
         System.out.println("No se puede unir");
     }
 }

 /**
  * Obtiene el equipo de Digimons del domador.
  * 
  * @return El equipo de Digimons del domador.
  */
 
 public List<Digimon> getEquipo() {
     return equipo;
 }

 /**
  * Obtiene el nombre del domador.
  * 
  * @return El nombre del domador.
  */
 
 public String getNombre() {
     return nombre;
 }
}

