package Ejercicio4;

public class Producto {
    String nombre;
    double precio;
    String IVA;

    public Producto(String nombre, double precio, String IVA) {
        this.nombre = nombre;
        this.precio = precio;
        this.IVA = IVA;
    }

    public double calIva() {
        double preciofinal = precio;
        if (IVA.equalsIgnoreCase("si")) {
            if (precio <= 500) {
                preciofinal = precio + (precio * 0.12);

            } else if (precio > 500 && precio <= 1500) {
                preciofinal = precio + (precio * 0.14);

            } else if (precio > 1500) {
                preciofinal = precio + (precio * 0.15);

            }
        }
        return preciofinal;
    }
}
