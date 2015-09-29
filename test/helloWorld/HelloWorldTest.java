package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.HelloWorld;

public class HelloWorldTest {
	@Test
	public void testHellowWorld(){
		HelloWorld  c = new HelloWorld();
		for(int i=0; i<121;i++){
		  c.aumentar();
		}
		assertEquals("un minuto", 2, c.getMinutos());
		assertEquals("cero segundos", 0, c.getSegundos());
	}
}
