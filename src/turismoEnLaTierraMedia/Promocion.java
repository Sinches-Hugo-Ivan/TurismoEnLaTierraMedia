package turismoEnLaTierraMedia;

public abstract class Promocion extends Producto {
	
	//No se por qu� no me pidi� sobreescribir los metodos abstractos, talvez sea porque cambi� la clase a abstracta

	public Promocion(String nombre, int costoEnMonedas, double tiempoEnHoras) {
		super(nombre, costoEnMonedas, tiempoEnHoras);
	}
	
	@Override
	public boolean consultarDisponibilidad(String user) {
		return false;
	}

	@Override
	public void comprar(String user) {
	}
}
