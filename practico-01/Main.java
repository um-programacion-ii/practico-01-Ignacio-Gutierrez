import Entidades.Despensa;
import Entidades.Ingrediente;

public class Main {
    public static void main(String[] args) {

        Despensa despensa = new Despensa();

        despensa.addIngrediente(new Ingrediente("Huevo",12));
        despensa.addIngrediente(new Ingrediente("Tomate",10));
        despensa.addIngrediente(new Ingrediente("Ternera",8));
        despensa.addIngrediente(new Ingrediente("Arroz",5000));
        despensa.addIngrediente(new Ingrediente("Aceite",10));

        System.out.println("Primer abastecimiento de la despensa");
        despensa.mostrarIngredientes();

        System.out.println("\nIntentando retirar ingredientes:");
        despensa.getIngrediente("Huevo", 6);
        despensa.getIngrediente("Tomate", 5);
        despensa.getIngrediente("Ternera", 8);
        despensa.getIngrediente("Arroz", 7000);

        System.out.println("\nEstado despensa:");
        despensa.mostrarIngredientes();

        System.out.println("\nIntentando abastecer ingredientes:");
        despensa.addIngrediente(new Ingrediente("Huevo", 7));
        despensa.addIngrediente(new Ingrediente("Tomate", 6));
        despensa.addIngrediente(new Ingrediente("Ternera", 2));
        despensa.addIngrediente(new Ingrediente("Fideos", 1000));

        despensa.mostrarIngredientes();
    }
}
