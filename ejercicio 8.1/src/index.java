import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("El String introducido por el usuario es: ");
		String linea = sc.nextLine();
		String[] array1 = linea.split(" ");
		
		System.out.println("El en el String introducido hay:  " + array1.length + " palabras");
		sc.close();
	}

}
