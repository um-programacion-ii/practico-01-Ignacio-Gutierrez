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
        Ingrediente ingredienteEncontrado = null;
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equals(nombre)) {
                ingredienteEncontrado = ingrediente;
                break;
            }
        }
        if (ingredienteEncontrado != null && ingredienteEncontrado.getCantidad() >= cantidad) {
            ingredienteEncontrado.sacar(cantidad);
        } else if (ingredienteEncontrado != null) {
            System.out.println("Solo quedan " + ingredienteEncontrado.getCantidad() + " de " + nombre + " en la despensa (Llenar despensa).");
        } else {
            System.out.println("No hay " + nombre + " en la despensa.");
        }
    }

    public void mostrarIngredientes() {
        System.out.println("Ingredientes en la despensa:");
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println(ingrediente.getNombre() + ": " + ingrediente.getCantidad());
        }
    }

    public boolean verificarIngrediente(String nombre, int cantidad) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equals(nombre)) {
                if (ingrediente.getCantidad() >= cantidad) {
                    return true;
                } else {
                    System.out.println("No hay suficiente " + nombre + " en la despensa, quedan "+ ingrediente.getCantidad() + ".");
                    return false;
                }
            }
        }
        System.out.println("No hay " + nombre + " en la despensa.");
        return false;
    }


}
