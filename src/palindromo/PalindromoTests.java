package palindromo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromoTests {
	
	@Test
	public void palabras() {
		assertTrue(Palindromo.esPalindromo("oro"));
		assertFalse(Palindromo.esPalindromo("loro"));
		
		assertTrue(Palindromo.esPalindromo("reconocer"));
		assertTrue(Palindromo.esPalindromo("orejero"));
	}

	@Test
	public void frasesConMayusculas() {
		assertTrue(Palindromo.esPalindromo("Dabale arroz a la Zorra el abad"));
	}
	
	@Test
	public void frasesConAsentos() {
		assertTrue(Palindromo.esPalindromo("Dábale arroz a la Zorra el abad"));
	}
	
	@Test
	public void frasesConSignosDePuntuacion() {
		assertTrue(Palindromo.esPalindromo("Ana, la tacaña catalana!"));
	}

}
