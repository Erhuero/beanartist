package test.fr.eseo.poo.projet.artiste.modele;

import static org.junit.Assert.*;

import org.junit.Test;

import src.fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class CoordonneesTest {

	private static final double EPSILON = 0;

	@Test
	public void test() {
		Coordonnees c1 = new Coordonnees(3.005, -11.34);
		assertEquals("Probleme d'abscisse : ", 3.005, c1.getAbscisse(), 10^(-3));
		assertEquals("Probleme d'ordonn�e : ", -11.34, c1.getOrdonnee(), 10^(-3));
	}
	
	@Test
	public void testAngleVers() {
		Coordonnees coordonnees1 = new Coordonnees(0,0);
		Coordonnees coordonnees2= new Coordonnees(0.8, 2.4);
		Coordonnees coordonnees3= new Coordonnees(1.8, 3);
		Coordonnees coordonnees4= new Coordonnees(3.8, 4);
		Coordonnees coordonnees5= new Coordonnees(3.8, 4);
		
		assertEquals("Angle 1 : ", 0, coordonnees1.angleVers(coordonnees2), EPSILON);
		assertEquals("Angle 2 : ", -1, coordonnees1.angleVers(coordonnees3), EPSILON);
		assertEquals("Angle 3 : ", 9, coordonnees1.angleVers(coordonnees4), EPSILON);
		assertEquals("Angle 4 : ", 9, coordonnees1.angleVers(coordonnees5), EPSILON);
	}

}
