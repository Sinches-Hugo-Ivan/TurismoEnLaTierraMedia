package turismoEnLaTierraMedia;

public abstract class Producto {
	protected int costoEnMonedas;
	protected double tiempoEnHoras;
	private String nombre;
	private enum tipo { Aventura, Paisaje, Degustación };		//No se usar enums... Hay que agregarlo al constructor

	
	public Producto(String nombre) {		//AGREGAR ENUM
		this.nombre = nombre;
	}

	public abstract boolean consultarDisponibilidad(String user);

	public abstract void comprar(String user);

}
