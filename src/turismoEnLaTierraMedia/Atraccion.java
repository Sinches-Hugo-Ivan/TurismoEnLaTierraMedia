package turismoEnLaTierraMedia;

public class Atraccion extends Producto {
	private int cupo; 
	private String[] usuarios;
	private int contadorUsuarios = 0;

	public Atraccion(String nombre, int costoEnMonedas, int tiempoEnHoras, int paramCupo, TipoDeProducto tipo) {
		super(nombre, tipo);
		super.costoEnMonedas = costoEnMonedas;
		super.tiempoEnHoras = tiempoEnHoras;
		usuarios = new String[paramCupo];
	}

	@Override
	public boolean hayLugar() {
		return (contadorUsuarios < cupo);
	}
	
	@Override
	public void comprado() {
		contadorUsuarios++;
	}

}