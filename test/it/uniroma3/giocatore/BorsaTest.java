package it.uniroma3.giocatore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.attrezzi.Attrezzo;

class BorsaTest {
	
	Borsa borsa = new Borsa();
	Attrezzo gomma = new Attrezzo("Gomma", 1);
	
	@Test
	void testIsEmpty() {
		assertTrue(borsa.isEmpty());
	}
	
	@Test
	void testHasAttrezzo() {
		borsa.addAttrezzo(gomma);
		assertTrue(borsa.hasAttrezzo("Gomma"));
	}
	
	//metodi per il test di addAttrezzo(), uguali a quelli della stanza
	
	@Test
	public void testAddAttrezzoInesistente() {
		assertFalse(borsa.addAttrezzo(null));
	}
	
	@Test
	public void testAddAttrezzoTrovato() {
		borsa.addAttrezzo(gomma);
		assertEquals(gomma, borsa.getAttrezzo("Gomma"));
	}
	
	@Test
	public void testAddAttrezzoPiuDiDieci() {
		for(int i=0; i<10; i++) {
			borsa.addAttrezzo(gomma);
		}
		assertFalse(borsa.addAttrezzo(new Attrezzo("Sasso", 5)));
	}
	
	//metodi per il test di removeAttrezzo(), simili a quelli della stanza
	
	@Test
	public void testRemoveAttrezzoNull() {
		assertNull(borsa.removeAttrezzo(null));
	}
	
	@Test
	public void testRemoveAttrezzoInesistente() {
		assertNull(borsa.removeAttrezzo("Gomma"));
	}
	
	@Test
	public void testRemoveAttrezzoTrovato() {
		borsa.addAttrezzo(gomma);
		assertEquals(gomma, borsa.removeAttrezzo("Gomma"));
	}

}
