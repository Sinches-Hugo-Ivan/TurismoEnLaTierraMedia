package turismoEnLaTierraMedia;

public class Atraccion extends Producto {
	private int cupo;
	private int contadorUsuarios = 0;

	public Atraccion(String nombre, int costoEnMonedas, int tiempoEnHoras, int paramCupo, TipoDeProducto tipo) {
		super(nombre, tipo);
		super.costoEnMonedas = costoEnMonedas;
		super.tiempoEnHoras = tiempoEnHoras;
		this.cupo = paramCupo;
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