package turismoEnLaTierraMedia;

public class Usuario {
	private int presupuesto;
	private double tiempoEnHoras;
	private String nombre;
	private String atracciónPreferida;
	
	public Usuario(String nombre, String atracciónPreferida, int presupuesto, double tiempoEnHoras) {
		this.nombre = nombre;
		this.atracciónPreferida = atracciónPreferida;
		this.presupuesto = presupuesto;
		this.tiempoEnHoras = tiempoEnHoras;
	}
	
	public void visitar () {
		// Hay que charlar bien como funcionaría
	}
	
	public boolean tienePresupuestoYTiempoSuficiente(int costoDelProducto, double duracionProducto) {
		return (this.presupuesto > costoDelProducto && this.tiempoEnHoras > duracionProducto);
	}

}
