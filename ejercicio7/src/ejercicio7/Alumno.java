package ejercicio7;

public class Alumno {
	private Notas notasalumnos = new Notas();
	private String nombre;
	private int numexpe;
	
	public Alumno() {
	}
	
	public Alumno(Notas notasalumnos, String nombre, int numexpe) {
		this.notasalumnos = notasalumnos;
		this.nombre = nombre;
		this.numexpe = numexpe;
	}
	
	public Notas getNotasalumnos() {
		return notasalumnos;
	}
	public void setNotasalumnos(Notas notasalumnos) {
		this.notasalumnos = notasalumnos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumexpe() {
		return numexpe;
	}
	public void setNumexpe(int numexpe) {
		this.numexpe = numexpe;
	}
	public String toString() {
		String todo = null;
		float media = 0;
		
		media = notasalumnos.media();
		
		todo = "\nAlumno: " + nombre + " " + numexpe + "\n";
		todo = todo + "******* Notas *******";
		System.out.println(todo);
		notasalumnos.Mostrar();
		System.out.println("Nota media: " + media);
		
		
		return todo;
	}
}
