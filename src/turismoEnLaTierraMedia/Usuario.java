package turismoEnLaTierraMedia;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private int presupuesto;
	private double tiempoEnHoras;
	private String nombre;
	private TipoDeProducto atraccionPreferida;
	private Itinerario itinerario;
	private List<Producto> atraccionesAdquiridas = new LinkedList<Producto>();

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
	
	public void agregarItinerario(Itinerario itinerario) {
		this.itinerario = itinerario;
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
	
	public Itinerario getItinerario() {
		return this.itinerario;
	}
	
	public void atraccionAdquirida(Atraccion atraccionNueva) {
		this.atraccionesAdquiridas.add(atraccionNueva);
	}
	
	public boolean tengoAtraccion(Producto atraccionConsulta) {
		boolean resultado = false;
		for (Producto cadaAtraccion : atraccionesAdquiridas) {
			if (cadaAtraccion == atraccionConsulta) {
				resultado = true;
			}
		}
		return resultado;
	}

}