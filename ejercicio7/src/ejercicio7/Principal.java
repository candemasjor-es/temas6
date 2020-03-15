package ejercicio7;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notas notas1 = new Notas();
		Notas notas2 = new Notas();
		notas1.leer();
		
		Alumno alumno1 = new Alumno(notas1, "Pepe", 34512);
		Alumno alumno2 = new Alumno();
		
		System.out.println("");
		
		notas2.leer();
		alumno2.setNotasalumnos(notas2);
		alumno2.setNombre("camilo");
		alumno2.setNumexpe(17780);
		
		
		alumno1.toString();
		alumno2.toString();

	}

}
