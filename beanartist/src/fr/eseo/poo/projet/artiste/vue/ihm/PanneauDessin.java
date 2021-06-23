package fr.eseo.poo.projet.artiste.vue.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import java.util.ArrayList;

import javax.swing.SwingUtilities;
import javax.swing.JPanel;
import fr.eseo.poo.projet.artiste.vue.formes.VueForme;
public class PanneauDessin extends JPanel {
	
	public static final int LARGEUR_PAR_DEFAUT = 800;
	public static final int HAUTEUR_PAR_DEFAUT = 480;
	public static final Color COULEUR_FOND_PAR_DEFAUT = Color.WHITE;
	private final List<VueForme> vueFormes = new ArrayList<VueForme>();
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
	
	public List<VueForme> getVueFormes(){
		return vueFormes;
	}
	
	public void ajouterVueForme(VueForme vueForme) {
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2D = (Graphics2D) g.create();
		
		for(int i = 0; i < vueFormes.size(); i++) {
			this.vueFormes.get(i).affiche(g2D);
	
		g2D.dispose();
	
		}
	
	}
}
