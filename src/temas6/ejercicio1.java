package temas6;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero[]=new int[10];
		Scanner sc=new Scanner(System.in);
		int i;
		for (i=0;i<numero.length; i++) {
			System.out.print("Introduce Numero ["+i+"] : ");
			numero[i]=sc.nextInt();
			
			
		}
		int par=0 ,imp=0, contadorPar=0, contadorimp=0;
		for (i=0;i<numero.length; i++) {
			if (i%2==0) {
				System.out.println("Los n�meros en posici�n par: "+numero[i]);
				par+=numero[i];
				contadorPar++;
				
			}else {
				System.out.println("Los n�meros en posici�n impar : "+numero[i]);
				imp+=numero[i];
				contadorimp++;
				
			}
		}
		
		System.out.println("El n�mero en posici�n par total : "+par);
		System.out.println("La media de posici�n par: "+par/contadorPar);
		System.out.println("El n�mero en posici�n imp total : "+imp);
		System.out.println("La media de posici�n impar: "+imp/contadorimp);
		sc.close();
	}

}
