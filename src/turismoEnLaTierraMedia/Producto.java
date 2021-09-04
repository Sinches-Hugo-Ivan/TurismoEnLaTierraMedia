package turismoEnLaTierraMedia;

public abstract class Producto {
	private int costoEnMonedas;
	private double tiempoEnHoras;
	private String nombre;

	private enum tipo {
		Aventura, Paisaje, Degustación
	};

	public Producto(String nombre, int costoEnMonedas, double tiempoEnHoras) {
		this.nombre = nombre;
		this.costoEnMonedas = costoEnMonedas;
		this.tiempoEnHoras = tiempoEnHoras;
	}

	public abstract boolean consultarDisponibilidad(String user);

	public abstract void comprar(String user);

}
