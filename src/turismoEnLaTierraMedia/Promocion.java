package turismoEnLaTierraMedia;

import java.util.List;

public abstract class Promocion extends Producto {

	protected List<Atraccion> atraccionesIncluidas;

	public Promocion(String nombre, TipoDeProducto tipo, List<Atraccion> atracciones) {
		super(nombre, tipo);
		this.atraccionesIncluidas = atracciones;
		for(Atraccion cadaAtraccion : atraccionesIncluidas) {
			super.tiempoEnHoras += cadaAtraccion.getTiempo();
		}
	}

	@Override
	public boolean hayLugar() {
		boolean resultado = true;
		for (Atraccion cadaAtraccion : atraccionesIncluidas)
			if (!cadaAtraccion.hayLugar()) {
				resultado = false;
			}
		return resultado;
	}
	
	@Override
	public void comprado() {
		for (Atraccion cadaAtraccion : atraccionesIncluidas) {
			cadaAtraccion.comprado();
		}
	}
	
	public List<Atraccion> getAtracciones() {
		return atraccionesIncluidas;
	}
}