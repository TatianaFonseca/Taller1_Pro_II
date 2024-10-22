package Ejercicio2;

public class Calculadora {
    double numero1, numero2;


    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double suma() {
        double suma;
        suma = numero1 + numero2;
        return suma;
    }
    public double resta(){
        double resta;
        resta= numero1-numero2;
        return resta;
    }
    public double multiplicacion(){
        double multiplicacion;
        multiplicacion=numero1*numero2;
        return multiplicacion;
    }
    public double division(){

            double division;
            division=numero1/numero2;
            return division;
        }

}
