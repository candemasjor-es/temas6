package temas6;

public class ejercicio0 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero[]=new int[10];
		int i,contadorPositivos = 0, contadornegativos=0;
		numero[0]=10;
		numero[1]=-5;
		numero[2]=24;
		numero[3]=5;
		numero[4]=-4;
		numero[5]=-5;
		numero[6]=12;
		numero[7]=-11;
		numero[8]=-3;
		numero[9]=40;
		double sumar=0;
		double menor=0;
		for (i=0;i<numero.length; i++) {
			if (numero[i]>0) {
				sumar+=numero[i];
				contadorPositivos ++;
				
			}else {
				menor+=numero[i];
				contadornegativos++;
			}
		}
		
		
		System.out.println("Sumar temperatura positivas: "+sumar);
		System.out.println("La media de las temperatura positivas: "+sumar/contadorPositivos);
		

		System.out.println("Sumar temperatura negativas: "+menor);
		System.out.println("La media de las temperatura negativas: "+menor/numero.length);
		
	}

}
