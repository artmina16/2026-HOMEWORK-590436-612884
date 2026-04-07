package it.uniroma3.ambienti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LabirintoTest {	
	private Labirinto labirintoDiProva = new Labirinto();
	private Stanza prova = new Stanza("Prova");	
	
	@Test 
	void testGetStanzaVincente() {
		assertNotNull(labirintoDiProva.getStanzaVincente());
	}
	
	@Test 
	void testGetStanzaCorrente() {
		assertNotNull(labirintoDiProva.getStanzaCorrente());
	}
	
	@Test 
	void testSetStanzaCorrente() {
		labirintoDiProva.setStanzaCorrente(prova);
		assertEquals(prova, labirintoDiProva.getStanzaCorrente());
	}	
	
}
