import Entidades.*;
public class Main {
    public static void main(String[] args) {

        Despensa despensa = new Despensa();

        despensa.addIngrediente(new Ingrediente("Huevo",12));
        despensa.addIngrediente(new Ingrediente("Ternera",8));
        despensa.addIngrediente(new Ingrediente("Arroz",5000));
        despensa.addIngrediente(new Ingrediente("Leche",2000));
        despensa.addIngrediente(new Ingrediente("Canela",10));
        despensa.addIngrediente(new Ingrediente("Azucar",2000));
        despensa.addIngrediente(new Ingrediente("Aceite",1500));
        despensa.addIngrediente(new Ingrediente("Papa",10));
        despensa.addIngrediente(new Ingrediente("Agua",10000));

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

        System.out.println("\nRecetas :\n-Huevo Duro");
        HuevoDuro huevoDuroReceta = new HuevoDuro();
        huevoDuroReceta.mostrarReceta();
        System.out.println("\n-Arroz con Leche");
        ArrozConLeche arrozConLeche = new ArrozConLeche();
        arrozConLeche.mostrarReceta();
        System.out.println("\n-Ternera al Horno");
        TerneraAlHorno terneraAlHorno = new TerneraAlHorno();
        terneraAlHorno.mostrarReceta();
    }
}
