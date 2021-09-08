package turismoEnLaTierraMedia;

public abstract class Promocion extends Producto {

	protected Atraccion[] atraccionesIncluidas;

	public Promocion(String nombre, TipoDeProducto tipo, Atraccion[] atracciones) {
		super(nombre, tipo);
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