import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("El String introducido por el usuario es: ");
		String linea = sc.nextLine().toLowerCase();
		
		System.out.print("Introduzca el carácter del que desea contar cuantas veces aparece: En un lugar de la mancha de cuyo nombre no quiero acordarme\r\n" + 
				"");
		
		char ch1 = sc.next().charAt(0);
	
		char[] array1 = linea.toCharArray();
		
		int a = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == ch1) {
				a++;
			}
		}
		
		
		System.out.println("El caracter '"+ ch1 + "' aparece " + a + " veces en la frase introducida");
		sc.close();
	}

}
