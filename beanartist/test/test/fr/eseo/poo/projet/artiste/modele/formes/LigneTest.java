package test.fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.*;

import org.junit.Test;

import src.fr.eseo.poo.projet.artiste.modele.Coordonnees;
import src.fr.eseo.poo.projet.artiste.modele.forme.Ligne;

public class LigneTest {

	@Test
	public void testSetC1() {
		Coordonnees c = new Coordonnees(10, 246);
		Ligne l = new Ligne();
		l.setC1(c);
		assertEquals("Probleme setC1 : ", c, l.getC1());
		assertEquals("Probleme setC1, c2 : ", new Coordonnees(100, 150), l.getC1());
	}

}
