package turismoEnLaTierraMedia;

import java.util.Comparator;

public class OrdenarProductosPorPrefYCosto implements Comparator<Producto> {
private TipoDeProducto tipoPreferido;
	
	public OrdenarProductosPorPrefYCosto(TipoDeProducto tipoPreferido) {
		this.tipoPreferido = tipoPreferido;
	}
	
	public int compare(Producto prod1, Producto prod2) {
		int comparacion;
		if(prod1.getTipo()==tipoPreferido && prod2.getTipo()!=tipoPreferido) {
			comparacion = -2;
		}
		else if(prod1.getTipo()!=tipoPreferido && prod2.getTipo()==tipoPreferido) {
			comparacion = 2;
		}
		else {
			comparacion = -Boolean.compare(prod1 instanceof Promocion, prod2 instanceof Promocion);
			if(comparacion == 0) {
				comparacion = -Double.compare(prod1.getCosto(), prod2.getCosto());
				if(comparacion == 0) {
					comparacion = -Double.compare(prod1.getTiempo(), prod2.getTiempo());
				}
			}
		}
		return comparacion;
	}

}
