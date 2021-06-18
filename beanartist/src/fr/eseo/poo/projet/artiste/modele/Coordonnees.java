package fr.eseo.poo.projet.artiste.modele;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import fr.eseo.poo.projet.artiste.modele.Coordonnees;

public class Coordonnees {
	
	public static final double ABSCISSE_PAR_DEFAUT = 0;
	public static final double ORDONNEE_PAR_DEFAUT = 0;
	private double abscisse, ordonnee;

	public Coordonnees(double abscisse, double ordonnee) {
		
		this.setAbscisse(abscisse);
		this.setOrdonnee(ordonnee);	
	}

	public Coordonnees() {
		
	}

	public double getAbscisse() {
		return abscisse;
	}
	
	public double getOrdonnee() {
		return ordonnee;
	}

	public void setAbscisse(double abscisse) {
		this.abscisse = abscisse;
	}
	
	public void setOrdonnee(double ordonnee) {
		this.ordonnee = ordonnee;
	}
	
	public void deplacerDe(double deltaX, double deltaY) {
		
		
		this.setAbscisse(this.getAbscisse() + deltaX);
		this.setOrdonnee(this.getOrdonnee() + deltaY);
		
	}
	
	public void deplacerVers(double nouvelleAbscisse, double nouvelleOrdonnee) {
		this.setAbscisse(nouvelleAbscisse);
		this.setOrdonnee(nouvelleOrdonnee);
	}
	
	public double distanceVers(Coordonnees autreCoordonnees) {
		//difference entre les nouvelles coordonnees contre les coordonnees de cette classe
		return Math.sqrt(((Math.pow(autreCoordonnees.getAbscisse() - this.getAbscisse(), 2)) + 
				((Math.pow(autreCoordonnees.getOrdonnee() - this.getOrdonnee(), 2)))));
	
	}
	
	public double angleVers(Coordonnees autreCoordonnees) {
		/*
		double angle = Math.atan2((autreCoordonnees.getOrdonnee() - this.getOrdonnee()) , (autreCoordonnees.getAbscisse() - this.getAbscisse()));
		
		if (this.getAbscisse() > autreCoordonnees.getAbscisse())
			angle = (this.getOrdonnee() > autreCoordonnees.getOrdonnee()) ? -Math.PI - angle : Math.PI - angle;
		return angle;
		
		
		double angle = 0;
		
		if(autreCoordonnees.getAbscisse() <=this.getAbscisse() && autreCoordonnees.getOrdonnee()<=this.getOrdonnee()) {
			angle = -(Math.atan((autreCoordonnees.getAbscisse() - getAbscisse()) / (autreCoordonnees.getOrdonnee() - getOrdonnee())) + Math.PI/2);
		}
		
		else if(autreCoordonnees.getAbscisse() >= this.getAbscisse() && autreCoordonnees.getOrdonnee() <= this.getOrdonnee()) {
			angle = -(Math.atan((autreCoordonnees.getOrdonnee() - getOrdonnee()) / (autreCoordonnees.getAbscisse() - getAbscisse())));
		}
		
		else if(autreCoordonnees.getAbscisse() <= this.getAbscisse() && autreCoordonnees.getOrdonnee() >= this.getOrdonnee() ) {
			angle = (Math.atan((autreCoordonnees.getAbscisse() - getAbscisse()) / (autreCoordonnees.getOrdonnee() - getOrdonnee())) + Math.PI/2);
		}
		
		else if(autreCoordonnees.getAbscisse() >= this.getAbscisse() && autreCoordonnees.getOrdonnee() >= 0) {
			angle = (Math.atan((autreCoordonnees.getOrdonnee() - getOrdonnee()) / (autreCoordonnees.getAbscisse() - getAbscisse())));
		}
		
		return angle;
	}
	*/
        double angle;
        if ((autreCoordonnees.getAbscisse() >= getAbscisse()) && (autreCoordonnees.getOrdonnee() <= getOrdonnee())) {
            angle = -(Math.acos((autreCoordonnees.getAbscisse() - getAbscisse()) / distanceVers(autreCoordonnees)));
        }
        else if ((autreCoordonnees.getAbscisse() <= getAbscisse()) && (autreCoordonnees.getOrdonnee() <= getOrdonnee())) {
            angle = -((Math.PI / 2) + Math.acos((getOrdonnee() - autreCoordonnees.getOrdonnee()) / distanceVers(autreCoordonnees)));
        }
        else if ((autreCoordonnees.getAbscisse() <= getAbscisse()) && (autreCoordonnees.getOrdonnee() >= getOrdonnee())) {
            angle = (Math.PI / 2) + Math.acos(((autreCoordonnees.getOrdonnee() - getOrdonnee()) / distanceVers(autreCoordonnees)));
        }
        else {
            angle = Math.acos((autreCoordonnees.getAbscisse() - getAbscisse()) / distanceVers(autreCoordonnees));
        }
        return angle;
    }
	
	/*
	@Override
	public String toString() {
		DecimalFormat formeDecimale = new DecimalFormat("0,0#");
		
		//formeDecimale.setMinimumIntegerDigits(1);
		//formeDecimale.setMaximumFractionDigits(2);
		
		//DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		//dfs.setDecimalSeparator('.');
		//formeDecimale.setDecimalFormatSymbols(dfs);
		
			return "(" + formeDecimale.format(this.getAbscisse()) + " , " + formeDecimale.format(this.getOrdonnee()) + ")";
	}
	*/

	@Override
	public String toString() {
		DecimalFormat formeDecimale = new DecimalFormat("0.0#");
		//return "Coordonnees [abscisse=" + abscisse + ", ordonnee=" + ordonnee + "]";
		return "(" + formeDecimale.format(this.getAbscisse()) + " , " + formeDecimale.format(this.getOrdonnee()) + ")";
	}
	/*
	public static void main(String[] args) {
		Coordonnees coor = new Coordonnees(2, 6);
		System.out.println(coor);
	}
*/
}

