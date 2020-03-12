package temas6;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double numero = 0;
		int i=0;
		for (i=0;i<19; i++ ) {
			numero =  Math.random();
			System.out.println("El número aleatorio guardado en la posición v["+i+"] "+numero);
		}
	}

}
