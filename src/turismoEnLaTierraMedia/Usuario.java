package turismoEnLaTierraMedia;

public class Usuario {
	private int presupuesto;
	private double tiempoEnHoras;
	private String nombre;
	private TipoDeProducto atraccionPreferida;

	public Usuario(String nombre, TipoDeProducto atraccionPreferida, int presupuesto, double tiempoEnHoras) {
		this.nombre = nombre;
		this.atraccionPreferida = atraccionPreferida;
		this.presupuesto = presupuesto;
		this.tiempoEnHoras = tiempoEnHoras;
	}

	public void visitar() {
		// Hay que charlar bien como funcionar­a
	}

	public boolean tienePresupuestoYTiempoSuficiente(int costoDelProducto, double duracionProducto) {
		return (this.presupuesto > costoDelProducto && this.tiempoEnHoras > duracionProducto);
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public double getTiempoEnHoras() {
		return tiempoEnHoras;
	}

	public TipoDeProducto getAtraccionPreferida() {
		return atraccionPreferida;
	}

}