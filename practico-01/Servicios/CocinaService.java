package Servicios;

import Entidades.*;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class CocinaService {
    private static final Map<Integer, String> recetas = new HashMap<>();

    static {
        recetas.put(1, "Entidades.ArrozConLeche");
        recetas.put(2, "Entidades.HuevoDuro");
        recetas.put(3, "Entidades.TerneraAlHorno");
    }

    public boolean comenzarACocinar(int numeroReceta, Despensa despensa) {
        String nombreClaseReceta = recetas.get(numeroReceta);
        if (nombreClaseReceta == null) {
            System.out.println("No existe esa receta en el menú.");
            return false;
        } else {
            try {
                Class<?> claseReceta = Class.forName(nombreClaseReceta);
                Receta receta = (Receta) claseReceta.getDeclaredConstructor().newInstance();
                receta.mostrarReceta();

                boolean ingredientesSuficientes = true;
                for (Ingrediente ingrediente : receta.getIngredientes()) {
                    String nombreIngrediente = ingrediente.getNombre();
                    int cantidadRequerida = ingrediente.getCantidad();
                    if (!despensa.verificarIngrediente(nombreIngrediente, cantidadRequerida)) {
                        ingredientesSuficientes = false;
                        break;
                    }
                }

                if (ingredientesSuficientes) {
                    for (Ingrediente ingrediente : receta.getIngredientes()) {
                        String nombreIngrediente = ingrediente.getNombre();
                        int cantidadRequerida = ingrediente.getCantidad();
                        despensa.getIngrediente(nombreIngrediente, cantidadRequerida);
                    }
                    System.out.println("¡La receta ha sido preparada!");
                    return true;
                } else {
                    System.out.println("No hay suficientes ingredientes para preparar la receta.");
                    return false;
                }

            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                     InvocationTargetException e) {
                System.out.println("Error al intentar cocinar la receta.");
                return false;
            }
        }
    }

}
