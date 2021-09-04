package turismoEnLaTierraMedia;

public class Atraccion extends Producto {
	private int cupo;	// Me parece que al agregar el array de usuarios, ya no es necesario este ...
						// ... atributo porque se puede obtener con un .lenght
	private String[] usuarios;
	private int contadorUsuarios = 0;	// No me gusta poner esto pero no se me ocurrió otra forma para llevar la ...
										// ... cantidad de usuarios en la atracción

	public Atraccion(String nombre, int costoEnMonedas, double tiempoEnHoras, int paramCupo) {
		super(nombre, costoEnMonedas, tiempoEnHoras);
		usuarios = new String[paramCupo];
	}

	private boolean usuarioNoRecibido(String user) {	// Se me ocurrió este método sobre la marcha para saber ...
		for (String cadaUsuario : usuarios) {			// ... si el usuario se encuentra en nuestro arrray de usuarios recibidos
			if (cadaUsuario.equals(user)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean consultarDisponibilidad(String user) {
		return (contadorUsuarios < usuarios.length && this.usuarioNoRecibido(user));
	}

	@Override
	public void comprar(String user) {
		if (contadorUsuarios == usuarios.length) {
			throw new Error("Atracción Completa");						// Si no se produce este error ...
		}
		if (!this.usuarioNoRecibido(user)) {
			throw new Error("Usuario ya ingresado en esta atracción");	// ... o este ...
		}
		this.usuarios[this.contadorUsuarios] = user;					// ... se agrega el usuario
		this.contadorUsuarios++;
	}

}
