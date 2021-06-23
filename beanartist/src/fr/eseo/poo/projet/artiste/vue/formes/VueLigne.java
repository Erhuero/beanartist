package fr.eseo.poo.projet.artiste.vue.formes;

import java.awt.Graphics2D;

import fr.eseo.poo.projet.artiste.modele.formes.Ligne;

public class VueLigne extends VueForme {
	
	public VueLigne(Ligne ligne) {
		super(ligne);
	}

	@Override
	public void affiche(Graphics2D g2d) {
		g2d.drawLine((int) Math.round(super.getForme().getPosition().getAbscisse()),
				(int) Math.round(super.getForme().getPosition().getOrdonnee()),
				(int) Math.round(super.getForme().getPosition().getAbscisse() + super.getForme().getLargeur()),
				(int) Math.round(super.getForme().getPosition().getAbscisse() + super.getForme().getLargeur()));
	}
	
	
}
