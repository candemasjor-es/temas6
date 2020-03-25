import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("El String introducido por el usuario es: ");
		String linea = sc.nextLine();
		linea = linea.trim();
		String[] array1 = linea.split(" ");
		
		System.out.println("Después de eliminar la última palabra la frase que queda es: ");
		
		for (int i = 0; i < array1.length-1; i++) {
			System.out.print(array1[i] + " ");
		}
		
		sc.close();
	}

}
