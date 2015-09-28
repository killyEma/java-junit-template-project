package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

public class CronometroTest(){
  @Test
	public void testHellowWorld(){
		Cronometro c = new Cronometro();
		for(int i=0; i<60;i++){
		  c.aumentar();
		}
		assertEquals("un minuto", 0, c.getMinutos());
	}
}
