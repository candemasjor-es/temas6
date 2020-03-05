package temas6;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double notas[]=new double [10];
		Scanner sc=new Scanner(System.in);
		int i;
		for (i=0;i<notas.length; i++) {
			do {
			System.out.print("Introduce notas ["+i+"]: ");
			notas[i]=sc.nextDouble();
			} while (notas[i]>10);
		}
		double max=0, todos=0;
		for (i=0;i<notas.length; i++) {
			todos+=notas[i];			
			if (notas[i]>5.5) {
				System.out.println("Los alumnos con notas superiores a la media: "+notas[i]);
				max+=notas[i];
				
			} 
		}
		System.out.println("Nota media de los alumnos: "+todos/notas.length);
		
		sc.close();
	}

}
