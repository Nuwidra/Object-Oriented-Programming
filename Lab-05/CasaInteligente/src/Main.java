
public class Main {
	JSONParser parser = new JSONParser();
	Controlador controlador = parser.cargarAparatos();
	controlador.get(0).encender();
	System.out.println(controlador);
	
/*
	public static void main(String[] args) {
		AparatoTermoRegulable atc = new AparatoTermoRegulable("Aire Acondicionado", "LG",null, 10, 35);
		atc.encender();
		atc.apagar();
		
		float[] canales = new float[] {7f, 102f, 150f,480f};
		AparatoConSeñal acs = new AparatoConSeñal("Televisor", "Samsung", null, canales);
		acs.encender();
		acs.apagar();
		
		String[] modalidades = {"delicado","intermedio","fuerte"};
		AparatoConModalidad acm = new AparatoConModalidad("Lavadora","Whirpool", null, modalidades);
		acm.encender();
		acm.apagar();
	}
*/
}
