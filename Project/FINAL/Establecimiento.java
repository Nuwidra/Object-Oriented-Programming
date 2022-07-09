import java.util.ArrayList;

public class Establecimiento {
	
	//Atributos
	public String nombreEstablecimiento;
	private int permisoSanitario;
	private String ubicacion;
	private int aforo;
	private ArrayList<String> colaboradores;

	//Método constructor
	public Establecimiento (String nombreEstablecimiento, int permisoSanitario,
							String ubicacion, int aforo, ArrayList<String> colaboradoresList) {
		this.nombreEstablecimiento = nombreEstablecimiento;
		this.permisoSanitario = permisoSanitario;
		this.ubicacion = ubicacion;
		this.aforo = aforo;
		this.colaboradores = colaboradoresList;
	}
	
	//Retornar nombre del Establecimiento
	public String getNombreEstablecimiento(){
		return nombreEstablecimiento;
	}
	

	public ArrayList<String> getListaColaboradores() {
		return colaboradores;
	}
}
