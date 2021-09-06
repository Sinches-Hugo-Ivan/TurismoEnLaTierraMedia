package turismoEnLaTierraMedia;

public abstract class Producto implements Comparable<Producto>{
	protected int costoEnMonedas;
	protected double tiempoEnHoras;
	private String nombre;
	private enum tipo { Aventura, Paisaje, Degustación };		//No se usar enums... Hay que agregarlo al constructor

	
	public Producto(String nombre) {		//AGREGAR ENUM
		this.nombre = nombre;
	}
	
	public Integer getCosto() {
		return this.costoEnMonedas;
	}
	
	public int compareTo(Producto otro) {
		return (this.getCosto().compareTo(otro.getCosto()));
	}

	public abstract boolean consultarDisponibilidad(String user);

	public abstract void comprar(String user);

}
