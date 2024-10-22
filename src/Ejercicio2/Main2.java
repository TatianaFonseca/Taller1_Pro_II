package Ejercicio2;

import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {
        int opcionint;
        do {
            JOptionPane.showMessageDialog(null, "*****Bienvenido a su calculadora****");
            String opcion = JOptionPane.showInputDialog("Ingrese la opcion que desea calcular: \n 1.- Suma \n 2.- Resta \n 3.-Multiplicacion \n 4.- Division \n 5.- Salir");
            opcionint = Integer.parseInt(opcion);
            if(opcionint == 5){
                JOptionPane.showMessageDialog(null,"Saliendo del programa");
            }else {
                String numero1=JOptionPane.showInputDialog("Ingrese el primer numero: ");
                double numero1d=Double.parseDouble(numero1);
                String numero2=JOptionPane.showInputDialog("Ingrese el segundo numero: ");
                double numero2d=Double.parseDouble(numero2);
                Calculadora calculadora = new Calculadora(numero1d, numero2d);
                switch (opcionint) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+calculadora.suma());
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+calculadora.resta());
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: "+calculadora.multiplicacion());
                        break;
                    case 4:
                        if(numero2d==0){
                            JOptionPane.showMessageDialog(null,"No se puede hacer la division");
                        }else {
                            JOptionPane.showMessageDialog(null, "El resultado de la division es: " + calculadora.division());
                        }
                        break;
                    default:
                            JOptionPane.showMessageDialog(null,"No existe esa opcion");
                }
            }
        } while (opcionint != 5);
    }
}
