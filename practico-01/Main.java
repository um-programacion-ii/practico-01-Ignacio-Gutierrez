import Entidades.Ingrediente;

public class Main {
    public static void main(String[] args) {
        Ingrediente ingrediente1 = new Ingrediente("Huevo",12);
        Ingrediente ingrediente2 = new Ingrediente("Tomate",10);

        System.out.println(ingrediente1);
        System.out.println(ingrediente2);
    }
}
