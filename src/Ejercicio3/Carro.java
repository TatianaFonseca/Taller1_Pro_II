package Ejercicio3;
/*
Se tiene un vehículo y se requiere saber cuántos kilómetros ha recorrido y mostrar la información de
este. Para esto se debe ingresar:
        • Numero de Motor.
• El número de ventanas tiene.
• La cantidad de puerta.
        • Marca
• Modelo
• Kilometraje Inicial
• Kilometraje Final */

public class Carro {
    String numeroDeMotor;
    int numeroDeVentanas;
    int numeroDePuertas;
    String marca;
    String modelo;
    double kilometrajeInicial;
    double kilometrajeFinal;

public Carro(String numeroDeMotor,int numeroDeVentanas, int numeroDePuertas
,String marca, String modelo, double kilometrajeInicial,double kilometrajeFinal) {
    this.numeroDeMotor = numeroDeMotor;
    this.numeroDeVentanas = numeroDeVentanas;
    this.numeroDePuertas = numeroDePuertas;
    this.marca=marca;
    this.modelo=modelo;
    this.kilometrajeInicial=kilometrajeInicial;
    this.kilometrajeFinal=kilometrajeFinal;
}
public double kilometrajeCal(){
    double resultado;
    resultado=kilometrajeFinal-kilometrajeInicial;
    return resultado;
}
public String Informacion(){
    String InformacionCarro=(" Numero de motor: "+numeroDeMotor +" \n Numero de ventanas: "+numeroDeVentanas
    +"\n Numero de puertas: "+numeroDePuertas+"\n Marca: "+ marca+"\n Modelo: "+ modelo+ "\n Kilometraje Inicial: "+kilometrajeInicial
    +"\n Kilometraje final: "+kilometrajeFinal+" \n Kilometros recorridos:"+ kilometrajeCal());
    return InformacionCarro;
}
}
