package turismoEnLaTierraMedia;

public class Sistema {
	private int atracciones;
	private int promociones;
	private Usuario[] usuarios;
	private int usuariosIngresados = 0;
	private Producto[] productos;
	private int productosIngresados = 0;

	public Sistema(int usuarios_, int atracciones_, int promociones_) {
		this.usuarios = new Usuario[usuarios_];
		this.atracciones = atracciones_;
		this.promociones = promociones_;
		this.productos = new Producto[atracciones_ + promociones_];
	}

	public void nuevoUsuario(String nombreUsuario, TipoDeProducto aventura, int monedas, int horas) {
		usuarios[usuariosIngresados] = new Usuario(nombreUsuario, aventura, monedas, horas);
		usuariosIngresados++;
	}

	public void nuevaAtraccion(String nombreAtraccion, int costo, int tiempo, int cupo, TipoDeProducto aventura) {
		productos[productosIngresados] = new Atraccion(nombreAtraccion, costo, tiempo, cupo, aventura);
		productosIngresados++;
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

	public Producto[] getAtraccionesYPromociones() {
		return this.productos;
	}

}