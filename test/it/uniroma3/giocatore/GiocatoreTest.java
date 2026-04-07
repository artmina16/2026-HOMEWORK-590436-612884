package it.uniroma3.giocatore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GiocatoreTest {
	
	Giocatore matteo = new Giocatore();
	
	@Test
	void testGetBorsaVuota() {
		assertNotNull(matteo.getBorsa());
	}

	@Test
	void testGetCfuIniziali() {
		assertEquals(20, matteo.getCfu());
	}
	
	@Test
	void testSetCfuToValue11() {
		matteo.setCfu(11);
		assertEquals(11, matteo.getCfu());
	}

}
