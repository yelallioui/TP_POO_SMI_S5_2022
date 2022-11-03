package etudiant;

public class TestEtudiant {
	
	public static void main (String args []) {
		// 5. a) 	Crée un étudiant e, instance de la classe Etudiant, en lui donnant un nom écrit directement dans le fichier source ;
		Etudiant e = new Etudiant (args[0]);
		
		// 5. b) 	Invoque la méthode travailler de l'étudiant e ;
		e.travailler();
		
		// 5. c) 	Invoque la méthode seReposer de l'étudiant e.
		e.seReposer();
		
		System.out.println(e.toString());
		
	}

}
