package turismoEnLaTierraMedia;

import java.util.List;

public class PromoAbsoluta extends Promocion {

	public PromoAbsoluta(String nombre, TipoDeProducto tipo, List<Atraccion> atracciones, int pcosto) {
		super(nombre, tipo, atracciones);
		super.costoEnMonedas = pcosto;
	}

}