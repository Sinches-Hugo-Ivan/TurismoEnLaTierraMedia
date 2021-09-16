package turismoEnLaTierraMedia;

import java.util.List;

public abstract class Promocion extends Producto {

	protected List<Producto> atraccionesIncluidas;

	public Promocion(String nombre, TipoDeProducto tipo, List<Producto> atracciones) {
		super(nombre, tipo);
		this.atraccionesIncluidas = atracciones;
		for(Producto cadaAtraccion : atraccionesIncluidas) {
			super.tiempoEnHoras += cadaAtraccion.getTiempo();
		}
	}

	@Override
	public boolean hayLugar() {
		boolean resultado = true;
		for (Producto cadaAtraccion : atraccionesIncluidas)
			if (!cadaAtraccion.hayLugar()) {
				resultado = false;
			}
		return resultado;
	}
	
	@Override
	public void comprado() {
		for (Producto cadaAtraccion : atraccionesIncluidas) {
			cadaAtraccion.comprado();
		}
	}
}