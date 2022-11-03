package segment;

public class Segment {
	// 1. a) 	Deux attributs privés de type double, extr1 et extr2, représentant les abscisses des extrémités d'un segment sur un axe ;
	private double extr1;
	private double extr2;
	
	// 1. b) b)	Un constructeur de ce segment recevant en arguments les deux valeurs entières des abscisses des extrémités du segment
	public Segment (double x1, double x2) {
		extr1 = x1;
		extr2 = x2;
	}
	
	// 1. c)	Une méthode publique retournant la longueur du segment ;
	public double longueur () {
		double distance = Math.abs(extr1 - extr2);
		return distance;
	}
	
	// 1. d) Une méthode dont le prototype est : public boolean appartient(double x) indiquant si le point de coordonnée x appartient ou non au segment ;
	public boolean appartient(double x) {
		if ((x<=extr1 && x>=extr2) || (x<=extr2 && x>=extr1))
			return true;
		else 
			return false;
	}

	// 1. e) f) g) h) getter et setter :
	public double getExtr1() {
		return extr1;
	}

	public void setExtr1(double extr1) {
		this.extr1 = extr1;
	}

	public double getExtr2() {
		return extr2;
	}

	public void setExtr2(double extr2) {
		this.extr2 = extr2;
	}
	// ------------------------------------
	
	// 1. i) Une méthode d'en-tête public String toString () qui décrira une instance de la classe Segment sous la forme d'une chaîne de caractères : par exemple, pour le segment d'extrémités -35 et 44, cette méthode retourne la chaîne "segment [-35,44]".
	public String toString () {		
		return "segment [" + Math.min(extr2, extr1) + ", " + Math.max(extr2, extr1) + "]";
	}
	
}
