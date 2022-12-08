import java.util.Date;

public class Employe {
	// les attributs : 𝑚𝑎𝑡𝑟𝑖𝑐𝑢𝑙𝑒, 𝑛𝑜𝑚, 𝑝𝑟é𝑛𝑜𝑚, 𝑑𝑎𝑡𝑒 𝑑𝑒 𝑛𝑎𝑖𝑠𝑠𝑎𝑛𝑐𝑒, 𝑑𝑎𝑡𝑒 𝑑’𝑒𝑚𝑏𝑎𝑢𝑐ℎ𝑒 et 𝑠𝑎𝑙𝑎𝑖𝑟𝑒.
	private String matricule, nom, prenom ;
	private Date dateNaissance, dateEmbauchge;
	private double salaire;
	
	// Définir un constructeur sans paramètre et un deuxième avec paramètre afin d’initialiser les attributs par des valeurs fournies.
	// Constructeur sans parametres :
	public Employe () {
		
	}
	// Constructeur avec parametre :
	public Employe(String matricule, String nom, String prenom, Date dateNaissance, Date dateEmbauchge) {
		super();
		this.matricule = matricule;
		this.nom = nom.toUpperCase();
		this.prenom = prenom.substring(0,1).toUpperCase() + prenom.substring(1).toLowerCase();
		this.dateNaissance = dateNaissance;
		this.dateEmbauchge = dateEmbauchge;
	}
	
	// Définir une méthode 𝑎𝑔𝑒 ( ) Qui retourne l’âge de l’employé.
	public int age () {
		Date dateNow = new Date();
		return dateNow.getYear() - dateNaissance.getYear() + 1900;
	}
	
	// Définir une méthode 𝑎𝑛𝑐𝑖𝑒𝑛𝑛𝑒𝑡é ( ) Qui retourne le nombre d’années d’ancienneté de 	l’employé.
		public int anciennete () {
			Date dateNow = new Date();
			return dateNow.getYear() - dateEmbauchge.getYear() + 1900;
		}
	
	// Définir une méthode 𝑎𝑢𝑔𝑚𝑒𝑛𝑡𝑎𝑡𝑖𝑜𝑛𝐷𝑢𝑆𝑎𝑙𝑎𝑖𝑟𝑒( ) qui augmente le salaire de l’employé en prenant en considération l’ancienneté :
	public void augmentationDuSalaire () {
		if (anciennete()<5) 
			setSalaire(salaire*1.02);		
		else if (anciennete()<10)
			setSalaire(salaire*1.05);
		else {
			setSalaire(salaire*1.1);
		}
	}
	
	// Définir la méthode 𝑎𝑓𝑓𝑖𝑐ℎ𝑒𝑟𝐸𝑚𝑝𝑙𝑜𝑦é( ) qui affiche les informations de l’employé comme suit :
	public void afficherEmploye () {
		System.out.println("Matricule : [" + 
				getMatricule() + "], Nom complet : [" + 
				getNom() + " " + getPrenom() + "], Âge : [" + 
				age() + "], Ancienneté : [" + anciennete() + 
				"], Salaire : [" + getSalaire() + "]");
	}
		
	// Définir les 𝑔𝑒𝑡𝑡𝑒𝑟𝑠 et les 𝑠𝑒𝑡𝑡𝑒𝑟𝑠 des différents attributs.
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Date getDateEmbauchge() {
		return dateEmbauchge;
	}
	public void setDateEmbauchge(Date dateEmbauchge) {
		this.dateEmbauchge = dateEmbauchge;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
	
}
