package temas6;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numero[]=new int[10];
		int i,contadorPositivos = 0, contadornegativos=0,contadorcero=0;
		for (i=0;i<numero.length; i++) {
			System.out.print("Introduce Numero ["+i+"] : ");
			numero[i]=sc.nextInt();			
		}

		for (i=0;i<numero.length; i++) {
			if (numero[i]==0) {
				
				contadorcero++;
				
			}
			if (numero[i]<0) {
				contadorPositivos++;
			}else {
				
				contadornegativos++;
			}
		}
		System.out.println("Positivas: "+contadorPositivos);
		System.out.println("Cero: "+contadorcero);
		System.out.println("Negativas: "+contadornegativos);
		sc.close();
	}

}
