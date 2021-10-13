package turismoEnLaTierraMedia;

import java.util.List;

public class Itinerario {
	private double costoTotal;
	private double tiempoTotal;
	private List<Atraccion> atraccionesAdquiridas;

	public void add(Atraccion atraccion) {
		this.atraccionesAdquiridas.add(atraccion);
	}
	
	public void setCosto (double pCosto) {
		this.costoTotal = pCosto;
	}
	
	public void setTiempo (double pTiempo) {
		this.tiempoTotal = pTiempo;
	}
	
	public boolean containsAtraccion(Producto productoConsulta) {
		boolean resultado = false;
		if (productoConsulta instanceof Promocion) {
			List<Atraccion> aux = ((Promocion)productoConsulta).getAtracciones();
			for (Atraccion cadaAtraccion : aux) {
				if (this.containsAtraccion(cadaAtraccion)) {
					resultado = true;
				}
			}
		}
		for (Producto cadaAtraccion : atraccionesAdquiridas) {
			if (cadaAtraccion == productoConsulta) {
				resultado = true;
			}
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Itinerario: " + this.atraccionesAdquiridas + "\nDuración Total: " + this.tiempoTotal + "\nCosto Total: "
				+ this.costoTotal + "\n";
	}
}
