
public class Principal {
	
	public static void main(String[] args){
    	
		String nombre, descripcion, listaHashtag;
		float costoHora, latitud, longitud;
		Servicio Alfombras;
		Servicio Jardinería;
		Servicio Guardería;
		        
		
		nombre = "Limpieza de Alfombras";
		
		costoHora = (float) 15000;
		descripcion = "Nos trasladamos hasta su hogar "+"\n"
				+ "para realizar una limpieza "+"\n"
				+ "profunda de sus alfombras, "+"\n"
				+ "nuestros productos le aseguran "+"\n"
				+ "desinfección total del 99% de "+"\n"
				+ "virus y bacterias.(única empresa"+"\n"
				+ "congarantíaanticovid19).";
		
		listaHashtag = "#limpieza #muebles #casa #covid19";
		
		latitud = (float) 10.068230;
		longitud = (float) -84.312330;
		        
		Alfombras = new Servicio(nombre, costoHora, descripcion, listaHashtag, latitud, longitud);
		
		System.out.println(Alfombras.toString());

        
        System.out.println("------------------------------------------------------------------------");
        
        
		nombre = "Jardinería";
		costoHora = (float) 8000;
		descripcion = "Ofrecemos servicios de jardinería " +"\n"
				+ "en la provincia de Alajuela. " +"\n"
				+ "Contamos con todo el equipo "+"\n"
				+ "necesario,cuidamos de sus"+"\n"
				+ "plantas y";
		
		listaHashtag = "#plantas #jardinería #casa";
		
		latitud = (float) 16.974260;
		longitud = (float) -96.726830;
		        
		Jardinería = new Servicio(nombre, costoHora, descripcion, listaHashtag, latitud, longitud);
		
		System.out.println(Jardinería.toString());

        System.out.println("------------------------------------------------------------------------");
        
        
		nombre = "Guardería infantil";
		
		costoHora = (float) 7500;
		descripcion = "Si tienes niños y tienes que salir no te preocupes más," +"\n"
				+ "te ofrecemos un servicio de gardería en Alajuela el cual" +"\n"
				+ "su hijo o hija recibirá el cuidado necesario y bienestar";
		
		listaHashtag = "#Guardería #Niños #Cuidado #Hogar";
		
		latitud = (float) 44.244167;
		longitud = (float) 7.769444;
		
		Guardería = new Servicio(nombre, costoHora, descripcion, listaHashtag, latitud, longitud);
		
        System.out.println(Guardería.toString());
        
	}
}