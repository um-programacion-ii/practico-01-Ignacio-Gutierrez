package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Despensa {
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Despensa() {
        this.ingredientes = new ArrayList<>();
    }

    public void addIngrediente(Ingrediente nuevoIngrediente) {
        boolean encontrado = false;
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equals(nuevoIngrediente.getNombre())) {
                ingrediente.setCantidad(ingrediente.getCantidad() + nuevoIngrediente.getCantidad());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            ingredientes.add(nuevoIngrediente);
        }
    }

    public void getIngrediente(String nombre, int cantidad) {
        boolean encontrado = false;
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equals(nombre) && ingrediente.getCantidad() > cantidad) {
                ingrediente.sacar(cantidad);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No es posible retirar " + cantidad + " de " + nombre + " de la despensa.");
        }
    }

    public void mostrarIngredientes() {
        System.out.println("Ingredientes en la despensa:");
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println(ingrediente.getNombre() + ": " + ingrediente.getCantidad());
        }
    }

}
