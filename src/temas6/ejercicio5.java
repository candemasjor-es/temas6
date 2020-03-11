package temas6;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
       String[] empleados = new String[10];
       double[] sueldos = new double[10];
       String nombre;
       double numero;

       int i = 0;
       System.out.println("Lectura de nombres y sueldos de empleados: ");
       System.out.print("Empleado " + (i + 1) + ": ");
       empleados[i] = sc.nextLine();
       System.out.print("Sueldo: ");
       sueldos[i] = sc.nextDouble();
       numero = sueldos[i];
       nombre = empleados[i];
       for (i = 1; i < empleados.length; i++) {
           sc.nextLine(); 
           System.out.print("Empleado " + (i + 1) + ": ");
           empleados[i] = sc.nextLine();
           System.out.print("Sueldo: ");
           sueldos[i] = sc.nextDouble();
           
           if (sueldos[i] > numero) {
               numero = sueldos[i];
               nombre= empleados[i];
           }
       }
       System.out.println("Empleado con mayor sueldo: " + nombre );
       System.out.println("Sueldo: " + numero);
	}

}
