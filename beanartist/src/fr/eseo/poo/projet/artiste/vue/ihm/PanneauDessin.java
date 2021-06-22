package fr.eseo.poo.projet.artiste.vue.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;

public class PanneauDessin extends JPanel {
	
	public static final int LARGEUR_PAR_DEFAUT = 800;
	public static final int HAUTEUR_PAR_DEFAUT = 480;
	public static final Color COULEUR_FOND_PAR_DEFAUT = Color.WHITE;
//	private final List<VueForme> vueFormes = new ArrayList<VueForme>();
	public double largeur, hauteur;
	
	public PanneauDessin() {
		this(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT, COULEUR_FOND_PAR_DEFAUT);
	}
	
	public PanneauDessin(int largeur, int hauteur, Color color) {
		super();
		Dimension dimension = new Dimension(largeur, hauteur);
		setPreferredSize(new Dimension(largeur, hauteur));
		this.setBackground(COULEUR_FOND_PAR_DEFAUT);
		setBackground(color);
	}
	
	
}
