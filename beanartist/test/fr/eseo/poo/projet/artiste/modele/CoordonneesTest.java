package fr.eseo.poo.projet.artiste.modele;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class CoordonneesTest {

	@Test
	public void test() {
		Coordonnees c1 = new Coordonnees(3.005, -11.34);
		assertEquals("Probleme d'abscisse : ", 3.005, c1.getAbscisse(), 10^(-3));
		assertEquals("Probleme d'ordonnée : ", -10, c1.getOrdonnee(), 10^(-3));
	}

}
