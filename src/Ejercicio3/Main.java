package Ejercicio3;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "***Bienvenido a su carro***");
         String numeroDeMotor = JOptionPane.showInputDialog("Ingrese el numero de motor de su carro");
         int numeroDeVentanas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventanas"));
         int numeroDePuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de puertas"));
         String marca = JOptionPane.showInputDialog("Ingrese la marca de su carro");
         String modelo = JOptionPane.showInputDialog("Ingrese el modelo de su carro");
         double kilometrajeInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje inicial"));
         double kilometrajeFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el kilometraje final"));

        Carro carr0 = new Carro(numeroDeMotor, numeroDeVentanas,numeroDePuertas
                ,marca, modelo,kilometrajeInicial, kilometrajeFinal);

        //imprimir la info del carro
       carr0.Informacion();
    }
}
