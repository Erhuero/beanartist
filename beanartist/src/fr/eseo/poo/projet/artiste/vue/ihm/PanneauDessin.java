package fr.eseo.poo.projet.artiste.vue.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class PanneauDessin extends JPanel {
	
	public static final int LARGEUR_PAR_DEFAUT = 1450;
	public static final int HAUTEUR_PAR_DEFAUT = 850;
	public static final Color COULEUR_FOND_PAR_DEFAUT = Color.white;
	public double largeur, hauteur;
	
	public PanneauDessin() {
		this(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT, COULEUR_FOND_PAR_DEFAUT);
	}
	
	public PanneauDessin(int largeur, int hauteur, Color color) {
		
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.setBackground(color);
		//this.COULEUR_FOND_PAR_DEFAUT = color;
	}
	
	
}
