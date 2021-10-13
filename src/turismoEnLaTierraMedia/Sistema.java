	package turismoEnLaTierraMedia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Sistema {
	private List<Usuario> usuarios = new LinkedList<Usuario>();
	private Map<TipoDeProducto, ArrayList<Producto>> productos = new TreeMap<TipoDeProducto, ArrayList<Producto>>();

	public void nuevoUsuario(String nombreUsuario, TipoDeProducto aventura, int monedas, int horas) {
		usuarios.add(new Usuario(nombreUsuario, aventura, monedas, horas));
	}

	public void agregarProducto(Producto producto) {
		ArrayList<Producto> aux;
		TipoDeProducto key = producto.getTipo();
		if (this.productos.containsKey(key)) {
			aux = this.productos.get(key);
		} else {
			aux = new ArrayList<Producto>();
		}
		aux.add(producto);
	}
	
	public void ofrecerProductos() {
		for (Usuario cadaUsuario : usuarios) {
			
			int presupuestoUsuario = cadaUsuario.getPresupuesto();
			double tiempoUsuario = cadaUsuario.getTiempoEnHoras();
			Itinerario itin = new Itinerario();
			
			for (Entry<TipoDeProducto, ArrayList<Producto>> cadaTipo : productos.entrySet()) {
				List<Producto> aux = cadaTipo.getValue();
				aux.sort(null);
				for (Producto cadaProducto : aux) {
					if (presupuestoUsuario >= cadaProducto.getCosto() && tiempoUsuario >= cadaProducto.getTiempo() && !itin.containsAtraccion(cadaProducto) && cadaProducto.hayLugar()) {
						presupuestoUsuario -= cadaProducto.getCosto();
						tiempoUsuario -= cadaProducto.getTiempo();
						cadaProducto.comprado();
						if (cadaProducto instanceof Promocion) {
							List<Atraccion> auxAtr = ((Promocion) cadaProducto).getAtracciones();
							for (Atraccion cadaAtraccion : auxAtr) {
								itin.add(cadaAtraccion);
							}
							
						} else if (cadaProducto instanceof Atraccion) {
							itin.add((Atraccion)cadaProducto);
						}
					}
				}
			}
			itin.setCosto(cadaUsuario.getPresupuesto() - presupuestoUsuario);
			itin.setTiempo(cadaUsuario.getTiempoEnHoras() - tiempoUsuario);
			cadaUsuario.setItinerario(itin);
		}
	}
}