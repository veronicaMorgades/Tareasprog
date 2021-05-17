package logica;

public class estudiante {
	private String nombre;
	private int ci;
	private String direccion;
	
	estudiante(String direccion, String nombre, int ci){
		this.direccion=direccion;
		this.nombre=nombre;
		this.ci=ci;
	}
	public void setDireccion(String direccion) {
		this.direccion=direccion;
		
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setCi(int ci) {
		this.ci=ci;
	}
	public String getDireccion() {
		return this.direccion;
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getCi() {
		return this.ci;
	}
	

}
