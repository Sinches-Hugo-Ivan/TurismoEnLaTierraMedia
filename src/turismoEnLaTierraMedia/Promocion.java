package turismoEnLaTierraMedia;

public abstract class Promocion extends Producto {
	
	protected Atraccion[] atraccionesIncluidas;

	public Promocion(String nombre, Atraccion[] atracciones) {
		super(nombre);
		this.atraccionesIncluidas = atracciones;
	}
	
	@Override
	public boolean consultarDisponibilidad(String user) {
		return false;
	}

	@Override
	public void comprar(String user) {
	}
}
