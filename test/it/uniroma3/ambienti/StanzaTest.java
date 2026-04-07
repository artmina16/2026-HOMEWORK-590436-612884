package it.uniroma3.ambienti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.attrezzi.Attrezzo;

public class StanzaTest {
	
	Stanza prova1 = new Stanza("Prova1");
	Stanza prova2 = new Stanza("Prova2");
	Stanza prova3 = new Stanza("Prova3");
	Attrezzo gomma = new Attrezzo("Gomma", 1);
	
	//metodi per il test di impostaStanzaAdiacente()
	
	@Test
	public void testImpostaStanzaAdiacenteDirezioneInesistente() {
		prova1.impostaStanzaAdiacente("ciao", prova2);
		assertNull(prova1.getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testImpostaStanzaAdiacente() {
		prova1.impostaStanzaAdiacente("nord", prova2);
		assertEquals(prova2, prova1.getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testImpostaDueStanzeAdiacentiNellaStessaDirezione() {
		prova1.impostaStanzaAdiacente("nord", prova2);
		prova1.impostaStanzaAdiacente("nord", prova3);
		assertEquals(prova3, prova1.getStanzaAdiacente("nord"));
	}
	
	//metodi per il test di addAttrezzo()
	
	@Test
	public void testAddAttrezzoInesistente() {
		assertFalse(prova1.addAttrezzo(null));
	}
	
	@Test
	public void testAddAttrezzoTrovato() {
		prova1.addAttrezzo(gomma);
		assertEquals(gomma, prova1.getAttrezzo("Gomma"));
	}
	
	@Test
	public void testAddAttrezzoPiuDiDieci() {
		for(int i=0; i<10; i++) {
			prova2.addAttrezzo(gomma);
		}
		assertFalse(prova2.addAttrezzo(new Attrezzo("Sasso", 5)));
	}
	
	//metodi per il test di removeAttrezzo()
	
	@Test
	public void testRemoveAttrezzoNull() {
		assertFalse(prova1.removeAttrezzo(null));
	}
	
	@Test
	public void testRemoveAttrezzoInesistente() {
		assertFalse(prova1.removeAttrezzo("Gomma"));
	}
	
	@Test
	public void testRemoveAttrezzoTrovato() {
		prova1.addAttrezzo(gomma);
		assertTrue(prova1.removeAttrezzo("Gomma"));
	}
}
