import java.util.Date;

public class Employe {
	// les attributs : πππ‘ππππ’ππ, πππ, ππΓ©πππ, πππ‘π ππ ππππ π ππππ, πππ‘π πβπππππ’πβπ et π ππππππ.
	private String matricule, nom, prenom ;
	private Date dateNaissance, dateEmbauchge;
	private double salaire;
	
	// DΓ©finir un constructeur sans paramΓ¨tre et un deuxiΓ¨me avec paramΓ¨tre afin dβinitialiser les attributs par des valeurs fournies.
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
	
	// DΓ©finir une mΓ©thode πππ ( ) Qui retourne lβΓ’ge de lβemployΓ©.
	public int age () {
		Date dateNow = new Date();
		return dateNow.getYear() - dateNaissance.getYear() + 1900;
	}
	
	// DΓ©finir une mΓ©thode πππππππππ‘Γ© ( ) Qui retourne le nombre dβannΓ©es dβanciennetΓ© de 	lβemployΓ©.
		public int anciennete () {
			Date dateNow = new Date();
			return dateNow.getYear() - dateEmbauchge.getYear() + 1900;
		}
	
	// DΓ©finir une mΓ©thode ππ’πππππ‘ππ‘ππππ·π’πππππππ( ) qui augmente le salaire de lβemployΓ© en prenant en considΓ©ration lβanciennetΓ© :
	public void augmentationDuSalaire () {
		if (anciennete()<5) 
			setSalaire(salaire*1.02);		
		else if (anciennete()<10)
			setSalaire(salaire*1.05);
		else {
			setSalaire(salaire*1.1);
		}
	}
	
	// DΓ©finir la mΓ©thode πππππβπππΈπππππ¦Γ©( ) qui affiche les informations de lβemployΓ© comme suit :
	public void afficherEmploye () {
		System.out.println("Matricule : [" + 
				getMatricule() + "], Nom complet : [" + 
				getNom() + " " + getPrenom() + "], Γge : [" + 
				age() + "], AnciennetΓ© : [" + anciennete() + 
				"], Salaire : [" + getSalaire() + "]");
	}
		
	// DΓ©finir les πππ‘π‘πππ  et les π ππ‘π‘πππ  des diffΓ©rents attributs.
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
