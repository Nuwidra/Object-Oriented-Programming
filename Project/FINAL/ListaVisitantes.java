import java.util.ArrayList;

public class ListaVisitantes {

	String fecha;
	ArrayList<String> lista;
	
	public ListaVisitantes(String fecha, ArrayList<String> lista) {
		super();
		this.fecha = fecha;
		this.lista = lista;
	}

	public String getFecha() {
		return fecha;
	}

	public ArrayList<String> getLista() {
		return lista;
	}
	
	
}
