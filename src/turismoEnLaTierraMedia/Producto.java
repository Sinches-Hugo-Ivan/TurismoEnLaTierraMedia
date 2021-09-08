package turismoEnLaTierraMedia;

public abstract class Producto implements Comparable<Producto> {
	protected int costoEnMonedas;
	protected int tiempoEnHoras;
	private String nombre;
	private TipoDeProducto tipo;

	public Producto(String nombre, TipoDeProducto tipo) { // AGREGAR ENUM
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public Integer getCosto() {
		return this.costoEnMonedas;
	}

	public int compareTo(Producto otro) {
		return (this.getCosto().compareTo(otro.getCosto()));
	}

	public abstract boolean consultarDisponibilidad(String user);

	public abstract void comprar(String user);

	public String getNombre() {
		return this.nombre;
	}

}