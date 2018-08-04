package mx.com.ipn.escom;

public class Alumno {
	private int boleta;
	private String nombre;
	private String apellidos;
	private String carrera;
	private String correo;
	
	public Alumno(int boleta, String nombre, String apellidos, String carrera, String correo) {
		super();
		this.boleta = boleta;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.carrera = carrera;
		this.correo = correo;
	}
	public Alumno() {
		
	}
	public int getBoleta() {
		return boleta;
	}
	public void setBoleta(int boleta) {
		this.boleta = boleta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}	
}
