package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String producto = "";
        double precio = 0.0;
        String opcionIVA = "";
        Scanner scanner=new Scanner(System.in);
        System.out.println("****Bienvenido a su producto");
        System.out.println("Ingrese el nombre de su producto: ");
        producto = scanner.nextLine();
        System.out.println("Ingrese el precio de su producto?: ");
        precio=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("El producto tiene IVA?: Escriba si o no");
        opcionIVA=scanner.nextLine();
        Producto producto1=new Producto(producto,precio,opcionIVA);
        if(opcionIVA.equalsIgnoreCase("si")){
            System.out.println("El nombre del producto es: "+producto);
            System.out.println("El precio del producto es: "+precio);
            System.out.println("El precio del producto calculado con IVA es:" + producto1.calIva());

        }else{
            System.out.println("El nombre del producto es: "+producto);
            System.out.println("El precio final del producto es: "+precio);
        }

    }

}
