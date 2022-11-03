package segment;

import java.util.Scanner;

public class TestSegment {
	
	

	public static void main(String[] args) {
		solution2 ();
	}
	
	// En utilisant la classe Point :
	public static void solution2 () {
		double x, y, z;
		Point p1=null, p2=null, px=null;
		
		Scanner scanner = new Scanner (System.in);
		
		for (int i=1; i<4; i++) {
			System.out.println("Entrer les cordonnées du point " + i + " : ");
			System.out.println("--------------------------------------");
			System.out.println("x : ");
			x = scanner.nextDouble();
			System.out.println("y : ");
			y = scanner.nextDouble();
			System.out.println("z : ");
			z = scanner.nextDouble();
			System.out.println("--------------------------------------");
			switch (i) {
				case 1 : p1 = new Point (x, y, z);
				break;
				case 2 : p2 = new Point (x, y, z);
				break;
				case 3 : px = new Point (x, y, z);
				break;			
			}
		}
		
		Segment segment = new Segment(p1, p2);
		
		System.out.println("Longueur du segment [" + p1.toString() + ", " + p2.toString() + "] : " + segment.longueurSegment());
		
		if (segment.appartient(px))
			System.out.println(px.toString() + " appartient au segment " + "[" + p1.toString() + ", " + p2.toString() + "]");
		else
			System.out.println(px.toString() + " n'appartient pas au segment " + "[" + p1.toString() + ", " + p2.toString() + "]");

		
		System.out.println("p1-px : " + p1.longueur(px));
		System.out.println("p2-px : " + p2.longueur(px));
		System.out.println("p1-p2 : " + segment.longueurSegment());
	}
	
	// En repondant tout simplement à l'exercice 3 de la série 1
	public static void solution1 () {
		double extr1, extr2, x;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Extremité 1 : ");
		extr1 = scanner.nextDouble();
		
		System.out.println("Extremité 2 : ");
		extr2 = scanner.nextDouble();
		
		System.out.println("x : ");
		x = scanner.nextDouble();
		
		Segment segment = new Segment(extr1, extr2);
		
		System.out.println("Longueur du segment [" + Math.min(extr1, extr2) + ", " + Math.max(extr1, extr2) + "] : " + segment.longueur());
		
		if (segment.appartient(x))
			System.out.println(x + " appartient au segment " + "[" + Math.min(extr1, extr2) + ", " + Math.max(extr1, extr2) + "]");
		else
			System.out.println(x + " n'appartient pas au segment " + "[" + Math.min(extr1, extr2) + ", " + Math.max(extr1, extr2) + "]");


	}

}
