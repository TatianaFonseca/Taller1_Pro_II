package Ejercicio5;

import java.time.LocalDate;

public class Empleado {
    int cedula;
    String nombre;
    String apellido;
    int genero;
   private double salario;
    LocalDate nacimiento;
    LocalDate fechaInicio;

    public Empleado(int cedula, String nombre, String apellido, int genero, double salario, LocalDate nacimiento, LocalDate fechaInicio) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero =genero;
        this.salario=salario;
        this.nacimiento=nacimiento;
        this.fechaInicio=fechaInicio;
    }
    public int calEdad(){
        //se usa una funcion llamada LocalDate para mas precision del ejercicio;
        int edad,mes,dia;
        LocalDate fecha = LocalDate.now();
        edad= fecha.getYear()- nacimiento.getYear();
        mes=fecha.getMonthValue()- nacimiento.getMonthValue();
        dia=fecha.getDayOfMonth()- nacimiento.getDayOfMonth();
        if( mes < 0 || (mes == 0 && dia < 0)) {
            edad= edad - 1;
        }
        return edad;
    }
    public double prestaciones(){
        int edadEnEmpresa,mes,ano,dia;
        double prestaciones;
        LocalDate fecha= LocalDate.now();
        edadEnEmpresa= fecha.getYear()- fechaInicio.getYear();
        mes= fecha.getMonthValue()- fechaInicio.getMonthValue();
        dia=fecha.getDayOfMonth()-fechaInicio.getDayOfMonth();
        if( mes < 0 || (mes == 0 && dia < 0)) {
            edadEnEmpresa= edadEnEmpresa - 1;
        }
       // p = (a * s)/12 (p: prestaciones, a: antigüedad, s: salario).
        prestaciones=(edadEnEmpresa*salario)/12;

        return prestaciones;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salarioN) {
        this.salario = salarioN;
    }

public void imprimirInfoEmpleado() {
    String generoStr = (genero == 1) ? "Femenino" : "Masculino"; // ejemplo usado en clase para if -else
    System.out.println("***** Información del Empleado *****");
    System.out.println("Cedula: " + cedula);
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Genero: " + generoStr);
    System.out.println("Salario: $" + salario);
    System.out.println("Fecha de Nacimiento: " + nacimiento);
    System.out.println("Fecha de Ingreso a la Empresa: " + fechaInicio);
    System.out.println("Edad: " + calEdad());
    System.out.println(" Prestaciones: $" + prestaciones());
    }
}
