package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Graphics2D;

import fr.eseo.poo.projet.artiste.modele.formes.Forme;

public abstract class VueForme {

	public VueForme(Forme forme) {
		
	}
	
	public Forme getForme() {
		return null;
		
	}
	
	public abstract void affiche(Graphics2D g2d);

}
