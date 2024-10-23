package Ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        int opcion;
        do {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Bienvenido a su calculadora de area y perimetro");
            System.out.println("Eliga una opcion(ponga 1 o 2 o 3 o 0 para salir) : ");
            System.out.println(" 1.- Triangulo \n 2.-Cuadrado \n 3.-Rectangulo \n Escriba:");
            opcion = Integer.parseInt(reader.readLine());

            switch (opcion) {
                case 1:
                    double lado1 = 0, base = 0, altura = 0, lado3 = 0, lado2 = 0;
                    System.out.println("Ingrese el valor de la base:");
                    base = Double.parseDouble(reader.readLine());
                    System.out.println("Ingrese el valor de la altura: ");
                    altura = Double.parseDouble(reader.readLine());
                    System.out.println("Ingrese el lado 1: ");
                    lado1 = Double.parseDouble(reader.readLine());
                    System.out.println("Ingrese el lado 2:");
                    lado2 = Double.parseDouble(reader.readLine());
                    System.out.println("Ingrese el lado 3:");

                    lado3 = Double.parseDouble(reader.readLine());

                    Triangulo triangulo = new Triangulo(base, altura, lado1, lado2, lado3);

                    System.out.println("El area del triangulo es: " + triangulo.calcularArea());
                    System.out.println("El perimetro del triangulo es: " + triangulo.calcularPerimetro());
                    break;
                case 2:
                    double lado = 0;
                    System.out.println("Ingrese el lado del cuadrado");
                    lado=Double.parseDouble(reader.readLine());

                    Cuadrado cuadrado = new Cuadrado(lado);

                    System.out.println("El area del cuadrado es: " + cuadrado.calcularArea());
                    System.out.println("El perimetro del cuadrado es: "+cuadrado.calcularPerimetro());
                    break;
                case 3:
                    double baseR = 0, alturaR = 0;
                    System.out.println("Ingrese la base del rectangulo:");
                    baseR = Double.parseDouble(reader.readLine());
                    System.out.println("Ingrese la altura del rectangulo");
                    alturaR = Double.parseDouble(reader.readLine());

                    Rectangulo rectangulo = new Rectangulo(baseR, alturaR);

                    System.out.println("El area del rectangulo es: "+ rectangulo.calcularArea());
                    System.out.println("El perimetro del rectangulo es: "+rectangulo.calcularPerimetro());
                    break;
                case 0:
                    System.out.println("Saliendo de la calculadora");
                    break;
                default:
                    System.out.println("No existe esa opcion");
                    main(args);
                    break;
            }
        } while (opcion != 0);
    }
}