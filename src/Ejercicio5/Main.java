package Ejercicio5;

import java.time.LocalDate;
import java.util.Scanner;

/*Se construirá una aplicación que ingrese los datos un empleado: cedula, nombre, apellido, genero,
salario, fecha de nacimiento y fecha de ingreso. La aplicación debe permitir que se modifique su salario
y que se calcule su edad y sus prestaciones. Para calcular las prestaciones se utilizar la formular p = (a
* s)/12 (p: prestaciones, a: antigüedad, s: salario).
Requerimientos funcionales de la aplicación:
        • Ingresar datos del empleado
• Modificar salario
• Calcular edad
• Calcular prestaciones*/
public class Main {
    public static void main(String[] args) {
        System.out.println("****Empleado*****");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese la cedula del empleado: ");
        int cedula= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el nombre del empleado:");
        String nombre=scanner.nextLine();
        System.out.println("Ingrese el apellido del empleado:");
        String apellido=scanner.nextLine();
        System.out.println("Ingrese el genero: 1.- Femenino 2.- Masculino");
        int genero=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el salario del emplado:");
        double salario= scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del empleado de la manera: YYYY-MM-DD");
        LocalDate nacimiento= LocalDate.parse(scanner.nextLine());
        System.out.println("Ingrese la fecha de ingreso a la empresa de la manera: YYYY-MM-DD");
        LocalDate fechaEmpresa= LocalDate.parse(scanner.nextLine());

        Empleado empleado=new Empleado(cedula,nombre,apellido,genero, salario,nacimiento,fechaEmpresa);

        System.out.println("Desea modificar el salario ingrese si o no?");
        String opcion=scanner.nextLine();
        if(opcion.equalsIgnoreCase("si")){
            System.out.println("Ingrese el nuevo salario:");
            empleado.setSalario(scanner.nextDouble());
            empleado.imprimirInfoEmpleado();
        }else {
            empleado.imprimirInfoEmpleado();
        }
    }
}
