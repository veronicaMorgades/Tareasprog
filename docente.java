package logica;
 
import java.time.LocalDate;

 public class docente {
	 private String nombre;
	 private int ci;
	 private LocalDate fechaDeIngreso;
	 
	 docente(LocalDate fechaDeIngreso,String nombre, int ci){
		 this.fechaDeIngreso= fechaDeIngreso;
		 this.nombre=nombre;
		 this.ci=ci;
		 
	 }
	 public void setNombre () {
		 this.nombre=nombre;
		 
	 }
	 public void setFechaDeIngreso() {
		 this.fechaDeIngreso=fechaDeIngreso;
	 }
	 public void  setCi() {
		 this.ci=ci;
	 }
	 public LocalDate getFechaDeIngreso() {
		 return fechaDeIngreso;
	 }
	 public String getNombre() {
		 return nombre;
	 }
	 public int getCi() {
		 return ci;
	 }
	 
	 
	
	 
	 
	 
}
