package it.uniroma3.ambienti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LabirintoTest {
	private Labirinto labirinto;
	private Stanza atrio;
	private Stanza biblioteca;
	@BeforeEach
	void setUp() throws Exception {
		this.labirinto = new Labirinto();
		this.atrio = new Stanza("atrio");
		this.biblioteca = new Stanza("biblioteca");
	}

	

}
