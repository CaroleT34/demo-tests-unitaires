package fr.diginamic.enumerations;

import static org.junit.Assert.*;

import org.junit.Test;

public class SaisonTest {

	@Test
	public void testvalueOfLibellePrintemps() {
		Saison valueTest = Saison.valueOfLibelle("Printemps");
		assertEquals(Saison.PRINTEMPS,valueTest);
	}
	
	@Test
	public void testvalueOfLibelleEte() {
		Saison valueTest = Saison.valueOfLibelle("Eté");
		assertEquals(Saison.ETE,valueTest);
	}
	
	@Test
	public void testvalueOfLibelleAutomne() {
		Saison valueTest = Saison.valueOfLibelle("Automne");
		assertEquals(Saison.AUTOMNE,valueTest);
	}
	
	@Test
	public void testvalueOfLibelleHiver() {
		Saison valueTest = Saison.valueOfLibelle("Hiver");
		assertEquals(Saison.HIVER,valueTest);
	}
	
	@Test
	public void testvalueOfLibelleNull() {
		Saison valueTest = Saison.valueOfLibelle("ier");
		assertNull(valueTest);
	}

}
