package fr.eseo.poo.projet.artiste.modele.formes;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class LigneTest {

	@Test
	public void testSetC1() {
		Coordonnees c = new Coordonnees(10, 246);
		Ligne l = new Ligne();
		
		l.setC1(c);
		
		assertEquals("Probleme setC1 : ", c, l.getC1());
		assertEquals("Probleme setC1, C2 : ", new Coordonnees(100, 150), l.getC1());
		//largeur hauteur de C1 et C2
	}
	
	@Test
	public void tesSet2() {
		Coordonnees co = new Coordonnees(7, 150);
		Ligne li = new Ligne();
		
		li.setC2(co);
		
		assertEquals("Probleme setC2 : ", co, li.getC2());
		assertEquals("Probleme setC2 ", new Coordonnees(50, 10), li.getC2());
	}

}
