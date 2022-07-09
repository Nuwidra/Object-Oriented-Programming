
public class Servicio {
	
	// Atributos de servicio
	String nombre;
	float costoHora;
	String descripcion;
	String listaHashtag;
	float latitud;
	float longitud;
	
	// Método Constructor
	public Servicio(String nombre, float costoHora, String descripcion, String listaHashtag, float latitud, float longitud){
		this.nombre      = nombre;
		this.costoHora   = costoHora;
		this.descripcion = descripcion;
		this.listaHashtag= listaHashtag;
		this.latitud     = latitud;
		this.longitud    = longitud;
	}
	
	// Get y Set de nombre
	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Get y Set de costo por hora
	public float getcostoHora() {
		return costoHora;
	}
	
	public void setcostoHora(float costoHora) {
		this.costoHora = costoHora;
	}
	
	// Get y Set de descripcion
	public String getdescripcion() {
		return descripcion;
	}
	
	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	// Get y Set de listaHashtag
	public String getlistaHashtag() {
		return listaHashtag;
	}
	
	public void listaHashtag(String listaHashtag) {
		this.listaHashtag = listaHashtag;
	}
	
	// Get y Set de latitud
	public float getlatitud() {
		return latitud;
	}
	
	public void setlatitud(float latitud) {
		this.latitud = latitud;
	}
	
	// Get y Set de longitud
	public float getLongitud() {
		return longitud;
	}
		
	public void setlongitud(float longitud) {
		this.longitud = longitud;
	}
	
	// Sobreescriba el método toString() para obtener la información de los objetos de modo legible
    @Override
    public String toString(){
        return nombre+"\n"+costoHora+" CRC / hora \n\n"+descripcion+"\n\n"+listaHashtag+"\n\n"+latitud+", "+longitud+ "\n"; 
    }

}