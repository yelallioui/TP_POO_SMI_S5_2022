import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Date dn = new Date (1990, 1, 1);
		Date de = new Date (2010, 5, 14);
		Employe e1 = new Employe("AC-3388", "aLi", "aLi", dn, de);
		
		e1.setSalaire(10000);
		
		e1.afficherEmploye();
		e1.augmentationDuSalaire();
		e1.afficherEmploye();
	}
}
