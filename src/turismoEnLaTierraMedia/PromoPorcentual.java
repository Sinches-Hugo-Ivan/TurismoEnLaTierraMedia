package turismoEnLaTierraMedia;

import java.util.List;

public class PromoPorcentual extends Promocion {

	public PromoPorcentual(String nombre, TipoDeProducto tipo, List<Producto> atracciones, int porcentaje) {
		super(nombre, tipo, atracciones);
		for(Producto cadaAtraccion : atracciones) {
			super.costoEnMonedas += cadaAtraccion.getCosto();
		}
		super.costoEnMonedas *= porcentaje/100;
	}

}