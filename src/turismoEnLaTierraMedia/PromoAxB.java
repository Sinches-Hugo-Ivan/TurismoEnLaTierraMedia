package turismoEnLaTierraMedia;

import java.util.List;

public class PromoAxB extends Promocion {

	public PromoAxB(String nombre, TipoDeProducto tipo, List<Atraccion> atracciones) {
		super(nombre, tipo, atracciones);
		for (int i = 1; i < atracciones.size(); i++) {
			super.costoEnMonedas += atracciones.get(i).getCosto();
		}
	}

}