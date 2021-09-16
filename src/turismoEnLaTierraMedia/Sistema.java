package turismoEnLaTierraMedia;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sistema {
	private int atracciones;
	private int promociones;
	private Usuario[] usuarios;
	private int usuariosIngresados = 0;
	private List<Producto> productos = new LinkedList<Producto>();

	public Sistema(int usuarios_, int atracciones_, int promociones_) {
		this.usuarios = new Usuario[usuarios_];
		this.atracciones = atracciones_;
		this.promociones = promociones_;
	}

	public void nuevoUsuario(String nombreUsuario, TipoDeProducto aventura, int monedas, int horas) {
		usuarios[usuariosIngresados] = new Usuario(nombreUsuario, aventura, monedas, horas);
		usuariosIngresados++;
	}

	public void nuevaAtraccion(String nombreAtraccion, int costo, int tiempo, int cupo, TipoDeProducto aventura) {
		productos.add(new Atraccion(nombreAtraccion, costo, tiempo, cupo, aventura));
	}

	public void nuevaPromoAbs(String nombre, TipoDeProducto tipo, List<Producto> atracciones, int costo) {
		productos.add(new PromoAbsoluta(nombre, tipo, atracciones, costo));
	}

	public void nuevaPromoAxB(String nombre, TipoDeProducto tipo, List<Producto> atracciones) {
		productos.add(new PromoAxB(nombre, tipo, atracciones));
	}

	public void nuevaPromoPorc(String nombre, TipoDeProducto tipo, List<Producto> atracciones, int porcentaje) {
		productos.add(new PromoPorcentual(nombre, tipo, atracciones, porcentaje));
	}
	
	public void ofrecerProductos() {
		for (Usuario cadaUsuario : usuarios) {
			for (Producto cadaProducto : productos) {
				int presupuestoUsuario = cadaUsuario.getPresupuesto();
				double tiempoUsuario = cadaUsuario.getTiempoEnHoras();
				productos.sort(new OrdenarProductosPorPrefYCosto(cadaUsuario.getAtraccionPreferida()));
				if (presupuestoUsuario >= cadaProducto.getCosto() && tiempoUsuario >= cadaProducto.getTiempo() && !cadaUsuario.tengoAtraccion(cadaProducto) && cadaProducto.hayLugar()) {
					cadaProducto.comprado();
					presupuestoUsuario -= cadaProducto.getCosto();
					tiempoUsuario -= cadaProducto.getTiempo();
				}
				
			}
		}
	}

	public int getCapacidadusuarios() {
		return usuarios.length;
	}

	public int getCapacidadAtracciones() {
		return this.atracciones;
	}

	public int getCapacidadPromociones() {
		return this.promociones;
	}

	public Usuario[] getUsuarios() {
		return this.usuarios;
	}

	public List<Producto> getAtraccionesYPromociones() {
		return this.productos;
	}

}