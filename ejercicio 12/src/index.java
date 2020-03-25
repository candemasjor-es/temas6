import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una cadena:  ");
		String linea = sc.nextLine().toLowerCase();
		linea = linea.trim();
		
		int i = 0, j = linea.length() -1;
		
		boolean capicua = true;
		
		while (i < j) {
			if (linea.charAt(i) != linea.charAt(j))
				capicua = false;
			
			i++;
			j--;
		}
		
		if (capicua) {
			System.out.println("La palabra introducida, "+linea + " SI es capicua");
		} else { System.out.println("La palabra introducida, "+linea + " NO es capicua"); }
		
		
		sc.close();
	}

}
