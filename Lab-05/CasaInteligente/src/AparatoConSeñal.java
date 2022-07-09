import java.util.Random;

public class AparatoConSeñal extends Aparato{
	
	private float[] señales;
	private float señalActual;
	
	public AparatoConSeñal(String nombre, String marca, Boolean estado, float[] señales) {
		super(nombre, marca, estado);
		this.señales = señales;
	}

	@Override
	public void encender() {
		super.encender();
		Random ran = new Random();
		int aleatorio = ran.nextInt(señales.length);
		this.señalActual = señales[aleatorio];
		System.out.println(super.toString() + "señal actual "+ señalActual);
		
	}

	@Override
	public void apagar() {
		super.apagar();
		System.out.println(super.toString());
	}
	
}
