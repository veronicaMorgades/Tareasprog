package logica;

public class tutores {
	private String nombre;
	private int ci;
	
	tutores(String nombre, int ci ){
		this.nombre=nombre;
		this.ci=ci;
	}
	public void setNombre() {
		this.nombre=nombre;
	}
	public void setCi() {
		this.ci=ci;
		
	}
	public String getNombre() {
		return this.nombre;
		
	}
	public int getCi() {
		return this.ci;
	}

}
