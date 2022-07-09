import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;


public class PersonasParser {
	
	private File personasJson;
	private ObjectMapper personasMapper;
	private JsonNode personasNode;
	
	public PersonasParser() {
		personasJson = new File("JsonFiles/personas.json");
		personasMapper = new ObjectMapper();
		
		try {
			personasNode = personasMapper.readTree(personasJson);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ListaPersonas updatePersonas() {
		
		ListaPersonas listaPersonas = new ListaPersonas();
		
		ArrayNode personas = (ArrayNode) personasNode.get("Personas");
		if(personas != null) {
			for(int i=0; i<personas.size(); i++) {
				JsonNode persona = personas.get(i);
				String nombre = persona.get("Nombre").asText();
				String fechaNacimiento = persona.get("Fecha de nacimiento").asText();
				String genero = persona.get("Genero").asText();
				String telefono = persona.get("Telefono").asText();
				String correo = persona.get("Correo electronico").asText();
				String burbuja = persona.get("Burbuja Social").asText();
				Persona person = new Persona(nombre, fechaNacimiento, genero, telefono, correo, burbuja);
				listaPersonas.add(person);
			}
		}
		
		return listaPersonas;
		
	}
}
