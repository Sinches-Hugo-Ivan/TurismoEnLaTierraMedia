package turismoEnLaTierraMedia;

public class Usuario {
	private int presupuesto;
	private double tiempoEnHoras;
	private String nombre;
	private String atracci�nPreferida;
	
	public Usuario(String nombre, String atracci�nPreferida, int presupuesto, double tiempoEnHoras) {
		this.nombre = nombre;
		this.atracci�nPreferida = atracci�nPreferida;
		this.presupuesto = presupuesto;
		this.tiempoEnHoras = tiempoEnHoras;
	}
	
	public void visitar () {
		// Hay que charlar bien como funcionar�a
	}
	
	public boolean tienePresupuestoYTiempoSuficiente(int costoDelProducto, double duracionProducto) {
		return (this.presupuesto > costoDelProducto && this.tiempoEnHoras > duracionProducto);
	}

}
