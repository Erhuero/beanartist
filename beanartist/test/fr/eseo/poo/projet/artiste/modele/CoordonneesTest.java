package fr.eseo.poo.projet.artiste.modele;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class CoordonneesTest {

	private static final double EPSILON = 0.001;

	@Test
	public void testCoordonnees() {
		
		Coordonnees c1 = new Coordonnees(3.005, -11.34);
		Coordonnees c2 = new Coordonnees(100, 100);
		
		assertEquals("Probleme d'abscisse : ", 3.005, c1.getAbscisse(), EPSILON);
		assertEquals("Probleme d'ordonnee : ", -11.34, c1.getOrdonnee(), EPSILON);
		assertEquals("Probleme d'abscisse : ", 100, c2.getAbscisse(), EPSILON);
		assertEquals("Probleme d'ordonnee : ", 100, c2.getOrdonnee(), EPSILON);
	}
	
	@Test
	public void testAngleVers() {
		
		Coordonnees coordonnees1 = new Coordonnees(0,0);		
		Coordonnees coordonnees2= new Coordonnees(0.8, 2.4);
		Coordonnees coordonnees3= new Coordonnees(1.8, 3);
		Coordonnees coordonnees4= new Coordonnees(3.8, 4);
		Coordonnees coordonnees5= new Coordonnees(3.8, 4);
		
		assertEquals("Angle 1 : ", 1.25, coordonnees1.angleVers(coordonnees2), EPSILON);
		assertEquals("Angle 2 : ", 1.03, coordonnees1.angleVers(coordonnees3), EPSILON);
		assertEquals("Angle 3 : ", 0.8110, coordonnees1.angleVers(coordonnees4), EPSILON);
		assertEquals("Angle 4 : ", 0.8110, coordonnees1.angleVers(coordonnees5), EPSILON);
	}

}
