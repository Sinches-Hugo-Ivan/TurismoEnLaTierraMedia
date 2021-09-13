package turismoEnLaTierraMedia;

import java.util.Arrays;

public class PromoAxB extends Promocion {

	public PromoAxB(String nombre, TipoDeProducto tipo, Producto[] atracciones) {
		super(nombre, tipo, atracciones);
		Arrays.sort(atracciones);
		for (int i = 1; i < atracciones.length; i++) {
			super.costoEnMonedas += atracciones[i].getCosto();
		}
	}

}