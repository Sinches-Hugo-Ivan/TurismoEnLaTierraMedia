package turismoEnLaTierraMedia;

import java.util.List;

public class Itinerario {
	private double costoTotal;
	private double tiempoTotal;
	private List<Producto> productosAdquiridos;

	public Itinerario(List<Producto> paseo) {
		this.productosAdquiridos = paseo;
		for (Producto cadaProducto : paseo) {
			this.costoTotal += cadaProducto.getCosto();
		}
		for (Producto cadaProducto : paseo) {
			this.tiempoTotal += cadaProducto.getTiempo();
		}
	}

	@Override
	public String toString() {
		return "Itinerario: " + this.productosAdquiridos + "\nDuración Total: " + this.tiempoTotal + "\nCosto Total: "
				+ this.costoTotal + "\n";
	}

}
