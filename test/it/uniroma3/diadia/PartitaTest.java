package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PartitaTest {
	private Partita partita = new Partita();
	
	
	@Test
	public void testIsFinitaCfuZero() {
		this.partita.setCfu(0);
		assertTrue(this.partita.isFinita());
	}
	
	@Test
	public void testIsFinitaStanzaVincenteTrovata() {
		Stanza biblioteca = this.partita.getStanzaVincente();
		this.partita.setStanzaCorrente(biblioteca);
		assertTrue(this.partita.isFinita());
	}
	
	@Test
	public void testIsFinita() {
		this.partita.setFinita();
		assertTrue(this.partita.isFinita());
	}

}
