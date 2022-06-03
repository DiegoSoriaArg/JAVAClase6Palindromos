package puntos;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PuntosTests {

	@Test
	public void toStringEnPUnto() {
		Punto p1 = new Punto(3, 4);
		assertEquals("(3.0,4.0)", p1.toString());
	}
	
	@Test
	public void quePuedoClonar() throws CloneNotSupportedException {
		Punto punto = new Punto(3, 4);
		Punto clon = punto.clone();
		
		assertNotSame(punto, clon);
		assertEquals(punto, clon);
	}
	
	@Test
	public void equals() {
		Punto uno = new Punto(3, 4);
		Punto dos = new Punto(3, 4);
		Punto tres = new Punto(3, 4);
		Punto cuatro = new Punto(5, 6);
		
		//reflexividad
		assertEquals(uno, uno);
		
		//simetria
		assertEquals(uno, dos);
		assertEquals(dos, uno);
		
		//transitividad
		assertEquals(uno, dos);
		assertEquals(dos, tres);
		assertEquals(uno, tres);
		
		// falsedad ante null
		assertNotEquals(uno, null);
		
		// dintintos
		assertNotEquals(uno, cuatro);
	}
	
	@Test
	public void testHashCode() {
		Punto uno = new Punto(3, 4);
		Punto dos = new Punto(3, 4);
		Punto cuatro = new Punto(5, 6);
		
		// consistencia ante la igualdad
		assertEquals(uno,dos);
		assertEquals(uno.hashCode(), dos.hashCode());
		
		assertNotEquals(uno.hashCode(), cuatro.hashCode());
	}
	
	@Test
	public void modulo() {
		Punto uno = new Punto(3, 4);
		assertEquals(5.0, uno.getModulo(), 0);
		
		Punto dos = new Punto(-3, -4);
		assertEquals(5.0, dos.getModulo(), 0);
	}
	
	@Test
	public void comparteTo() {
		Punto uno = new Punto(3, 4);
		Punto dos = new Punto(4, 5);
		Punto tres = new Punto(3, 4);
		
		assertTrue(uno.compareTo(dos) < 0);
		assertTrue(dos.compareTo(uno) > 0);
		assertEquals(0, uno.compareTo(tres));
	}
	
	@Test
	public void ordenar() {
		
		
		Punto[] puntos = {
				new Punto(2, 3),
				new Punto(4, 5),
				new Punto(0, 0),
				new Punto(1, 1)
		};
		
		System.out.println(Arrays.toString(puntos));
		
		Arrays.sort(puntos);
		
		System.out.println(Arrays.toString(puntos));
	}

}
