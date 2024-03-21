package Entidades;public class Ingrediente {
    private String nombre;
    private int cantidad;

    public Ingrediente(String nombre, int cantidad) {
        this.nombre=nombre;
        this.cantidad=cantidad;
    }

    public void sacar(int cantidadARetirar) {
        if (this.cantidad >= cantidadARetirar) {
            this.cantidad -= cantidadARetirar;
            System.out.println("Se retiraron " + cantidadARetirar + " " + nombre + ", quedan " + this.cantidad);
        } else {
            System.out.println("No es posible sacar " + cantidadARetirar + " " + nombre + ", quedan " + this.cantidad);
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String toString() {
        return "Quedan " + cantidad + " " + nombre;
    }
}
