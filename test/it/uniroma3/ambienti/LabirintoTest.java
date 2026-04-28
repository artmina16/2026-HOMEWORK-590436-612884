package it.uniroma3.ambienti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;

class LabirintoTest {	
	private Partita partitaDiProva = new Partita();
	private Labirinto labirintoDiProva = new Labirinto();
	private Stanza prova = new Stanza("Prova");	
	
	@Test 
	void testGetStanzaVincente() {
		assertNotNull(labirintoDiProva.getStanzaVincente());
	}
	
	@Test 
	void testGetStanzaCorrente() {
		assertNotNull(partitaDiProva.getStanzaCorrente());
	}
	
	@Test 
	void testSetStanzaCorrente() {
		partitaDiProva.setStanzaCorrente(prova);
		assertEquals(prova, partitaDiProva.getStanzaCorrente());
	}	
	
}
