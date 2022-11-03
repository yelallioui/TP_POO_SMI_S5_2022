package etudiant;

public class Etudiant {
	
	// 	4. a) Un attribut privé de type String nommé nom ;
	private String nom;
	
	// 4. b) 	Un constructeur public qui a un paramètre de type String servant à initiliser le nom de l'étudiant ;
	public Etudiant (String nom) {
		this.nom = nom;
	}
	
	// 4. c) 	Une méthode publique sans paramètre et qui ne renvoie rien, nommée travailler (), qui écrit à l'écran, si le nom de l'étudiant est toto, "toto se met au travail !".
	public void travailler () {
		System.out.println(nom + " se met au travail !");
	}
	
	// 4. d) 	Une méthode publique sans paramètre et qui ne renvoie rien, nommée seReposer (), qui écrit à l'écran, si le nom de l'étudiant est toto, "toto se repose".
	public void seReposer () {
		System.out.println(nom + " se repose !");
	}
}
