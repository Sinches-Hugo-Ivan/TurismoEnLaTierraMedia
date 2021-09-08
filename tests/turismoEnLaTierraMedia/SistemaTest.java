package turismoEnLaTierraMedia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SistemaTest {

	@Before
	public void preparacion() {
		Sistema sistema = new Sistema(50, 20, 10);
		sistema.nuevoUsuario("Eowyn", TipoDeProducto.AVENTURA, 10, 8);
		sistema.nuevaAtraccion("Moria", 10, 2, 6, TipoDeProducto.AVENTURA);
		sistema.nuevaAtraccion("BosqueNegro", 3, 4, 12, TipoDeProducto.AVENTURA);
		sistema.nuevaAtraccion("Mordor", 25, 3, 4, TipoDeProducto.AVENTURA);
	}

	@Test
	public void crearUnaInstanciaDelSistemaCon50UsuariosY20AtraccionesY10Promociones() {
		Sistema sistema = new Sistema(50, 20, 10);
		assertNotNull(sistema);
		assertEquals(50, sistema.getCapacidadusuarios());
		assertEquals(20, sistema.getCapacidadAtracciones());
		assertEquals(10, sistema.getCapacidadPromociones());
	}

	@Test
	public void agregarNuevoUsuarioAlsistema() {
		Sistema sistema = new Sistema(50, 20, 10);
		sistema.nuevoUsuario("Eowyn", TipoDeProducto.AVENTURA, 10, 8);
		assertEquals("Eowyn", sistema.getUsuarios()[0].getNombre());
	}

	@Test
	public void agregarNuevaAtraccionalsistema() {
		Sistema sistema = new Sistema(50, 20, 10);
        sistema.nuevaAtraccion("Moria", 10, 2,6,TipoDeProducto.AVENTURA);
        assertEquals("Moria", sistema.getAtraccionesYPromociones()[0].getNombre());
	}

/*
 * @Test
 * public void agregarNuevaPromocionPorcentajeAlSistema() { Atraccion[]
 * listaDeAtracciones = new Atraccion[2]; listaDeAtracciones[0] =
 * sistema.getAtracciones()[1]; listaDeAtracciones[1] =
 * sistema.getAtracciones()[2];
 * sistema.nuevaPromocionPorcentaje("Pack aventura", listaDeAtraccion
 * assertEquals("Pack aventura", sistema.getPromociones()[0].getNombre }
 */
}