package turismoEnLaTierraMedia;

public abstract class Promocion extends Producto {

	protected Producto[] atraccionesIncluidas;

	public Promocion(String nombre, TipoDeProducto tipo, Producto[] atracciones) {
		super(nombre, tipo);
		this.atraccionesIncluidas = atracciones;
		for(Producto cadaAtraccion : atraccionesIncluidas) {
			super.tiempoEnHoras += cadaAtraccion.getTiempo();
		}
	}

	@Override
	public boolean consultarDisponibilidad(String user) {
		return false;
	}

	@Override
	public void comprar(String user) {
	}
}