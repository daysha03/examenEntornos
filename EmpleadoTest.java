package examenEntornos;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoTest {

	@Test
	public void comprobar() {
		System.out.println("El nombre es: ");
		Empleado e = new Empleado("Alvaro", 1, "EEP", 2.5);
		assertTrue(e.getNombre()=="Alvaro");
		assertTrue(e.getCedula()==1);
		assertTrue(e.getDireccion()=="EEP");
		assertTrue(e.getSalario()==2.5);	
	}
}
