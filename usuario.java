package logica;

 public class Usuario {
	private String nombre;
	private int ci;
	 
	Usuario(String nombre, int ci ){
	 this.nombre = nombre;
	 this.ci = ci;
	
	}
	public void  setNombre(String nombre) {
		this.nombre = nombre;
	}
	 public void setCi (int ci ) {
		 this.ci= ci;
	 }
	 public String getNombre() {
		 return this.nombre;
	 }
	 public int getCi() {
		 return this.ci;
		 
	 }
	
}