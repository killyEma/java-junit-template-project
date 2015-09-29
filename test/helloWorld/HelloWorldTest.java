package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.HelloWorld;

public class HelloWorldTest {
	@Test
	public void testHellowWorld(){
		HelloWorld  c = new HelloWorld();
		for(int i=0; i<120;i++){
		  c.aumentar();
		}
		assertEquals("un minuto", 2, c.getMinutos());
		assertEquals("cero segundos", 0, c.getSegundos());
	}
	
	@Test
	public void testCincoMinutos(){
		HelloWorld  c = new HelloWorld();
		for(int i=0; i<321;i++){
		  c.aumentar();
		}
		assertEquals("cinco minutos", 5, c.getMinutos());
		assertEquals("veinti un segundos", 21, c.getSegundos());
	}
	
	@Test
	public void testMasMinutoss(){
		HelloWorld  c = new HelloWorld();
		for(int i=0; i<5940;i++){
		  c.aumentar();
		}
		assertEquals("cinco minutos", 99, c.getMinutos());
		assertEquals("cero segundos", 0, c.getSegundos());
	}
}
