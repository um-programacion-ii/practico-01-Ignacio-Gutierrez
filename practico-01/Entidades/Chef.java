package Entidades;

import Servicios.CocinaService;

public class Chef {
    private String nombre;
    private int estrellasMichelin;
    private Despensa despensa;

    public Chef(String nombre, int estrellasMichelin, Despensa despensa) {
        this.nombre = nombre;
        this.estrellasMichelin = estrellasMichelin;
        this.despensa = despensa;
    }

    public void prepararReceta(int numeroReceta, CocinaService cocinaService) {
        boolean recetaPreparada = cocinaService.comenzarACocinar(numeroReceta, despensa);
        if (recetaPreparada) {
            System.out.println("El Chef " + nombre + ", con " + estrellasMichelin + " estrellas Michelin, espera que disfrute su comida.");
        } else {
            System.out.println("El Chef " + nombre + ", con " + estrellasMichelin + " estrellas Michelin, dice que debe pedir algo del menú.");
        }
    }

    public String toString() {
        return "El Chef " + nombre + " tiene " + estrellasMichelin + " estrellas Michelin..";
    }
}
