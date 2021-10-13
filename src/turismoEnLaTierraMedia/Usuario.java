	package turismoEnLaTierraMedia;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private int presupuesto;
	private double tiempoEnHoras;
	private String nombre;
	private TipoDeProducto atraccionPreferida;
	private Itinerario itinerario;

	public Usuario(String nombre, TipoDeProducto atraccionPreferida, int presupuesto, double tiempoEnHoras) {
		this.nombre = nombre;
		this.atraccionPreferida = atraccionPreferida;
		this.presupuesto = presupuesto;
		this.tiempoEnHoras = tiempoEnHoras;
	}
	
	@Override
	public String toString() {
		return "Nombre usuario: " + nombre +", Preferencia: " + atraccionPreferida + ", Presupuesto: " + presupuesto
				+ "y Tiempo en Horas: " + tiempoEnHoras ;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getPresupuesto() {
		return this.presupuesto;
	}

	public double getTiempoEnHoras() {
		return this.tiempoEnHoras;
	}

	public TipoDeProducto getAtraccionPreferida() {
		return atraccionPreferida;
	}
	
	public void setItinerario(Itinerario itin) {
		this.itinerario = itin;
	}

}