package temas6;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero[]=new int[20];
		Scanner sc=new Scanner(System.in);
		int i;
		for (i=0;i<numero.length; i++) {
			System.out.print("Introduce Numero ["+i+"] : ");
			numero[i]=sc.nextInt();			
		}
		int par=0 ,imp=0, contadorPar=0, contadorimp=0;
		for (i=0;i<numero.length; i++) {
			if (i%2==0) {
				System.out.println("Los números en posición par: "+numero[i]);
				par+=numero[i];
				contadorPar++;
				
			
			}
		}
		
		System.out.println("El número en posición par total : "+par);
		System.out.println("La media de posición par: "+par/contadorPar);

		sc.close();
	}

}
