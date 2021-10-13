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

	public String getNombre() {
		return this.nombre;
	}

	public int getTiempo() {
		return this.tiempoEnHoras;
	}

	public Integer getCosto() {
		return this.costoEnMonedas;
	}
	
	public TipoDeProducto getTipo() {
		return this.tipo;
	}
	
	public int compareTo(Producto otro) {
		return (this.getCosto().compareTo(otro.getCosto()));
	}

	public abstract boolean hayLugar();
	
	public abstract void comprado();

}