
public class Persona {

	//Atributos
	public String nombre;
	private String fechaNacimiento;
	private String genero;
	private String telefono;
	private String correo;
	public String burbuja;

	public Persona(String nombre, String fechaNacimiento,
			String genero, String telefono, String correo,
			String burbuja) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.telefono = telefono;
		this.correo = correo;
		this.burbuja = burbuja;
		
	}
	
	//Retornar nombre
	public String getNombre(){
		return nombre;
	}
	
	public String getBurbuja(){
		return burbuja;
	}
}
