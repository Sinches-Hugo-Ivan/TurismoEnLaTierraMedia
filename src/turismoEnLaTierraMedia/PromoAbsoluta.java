package turismoEnLaTierraMedia;

public class PromoAbsoluta extends Promocion {

	public PromoAbsoluta(String nombre, TipoDeProducto tipo, Producto[] atracciones, int pcosto) {
		super(nombre, tipo, atracciones);
		super.costoEnMonedas = pcosto;
	}

}