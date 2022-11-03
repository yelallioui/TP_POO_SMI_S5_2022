package segment;

import java.util.Scanner;

public class TestSegment {

	public static void main(String[] args) {
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
