import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class EstablecimientosParser {

	private File establecimientosJson;
	private ObjectMapper establecimientosMapper;
	private JsonNode establecimientosNode;
	
	public EstablecimientosParser() {
		establecimientosJson = new File("JsonFiles/establecimientos.json");
		establecimientosMapper = new ObjectMapper();
	
		try {
			establecimientosNode = establecimientosMapper.readTree(establecimientosJson);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ListaEstablecimientos updateEstablecimientos() {
		
		ListaEstablecimientos listaEstablecimientos = new ListaEstablecimientos();
		
		ArrayNode establecimientos = (ArrayNode) establecimientosNode.get("establecimientos");
		if (establecimientos != null) {
			for(int i=0; i<establecimientos.size(); i++) {
				JsonNode establecimiento = establecimientos.get(i);
				String nombre = establecimiento.get("Nombre").asText();
				int permisoSanitario = establecimiento.get("Numero de permiso sanitario").asInt();
				String ubicacion = establecimiento.get("Ubicacion").asText();
				int aforo = establecimiento.get("Aforo").asInt();
				ArrayNode colaboradoresJSON = (ArrayNode) establecimiento.get("ListaDeColaboradores");
				ArrayList <String> colaboradoresList = new ArrayList <String>();
				if (colaboradoresJSON != null) {
					for(int j=0; j<colaboradoresJSON.size(); j++) {
						colaboradoresList.add(colaboradoresJSON.get(j).asText());
					}
				}
				Establecimiento establishment = new Establecimiento(nombre, permisoSanitario, ubicacion, aforo, colaboradoresList);
				listaEstablecimientos.add(establishment);
			}
		
		}
		return listaEstablecimientos;
	}
}
