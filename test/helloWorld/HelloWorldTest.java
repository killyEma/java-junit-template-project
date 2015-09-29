package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.HelloWorld;

public class HelloWorldTest {
	@Test
	public void testHellowWorld(){
		HelloWorld  c = new HelloWorld();
		for(int i=0; i<60;i++){
		  c.aumentar();
		}
		assertEquals("un minuto", 1, c.getMinutos());
	}
}
