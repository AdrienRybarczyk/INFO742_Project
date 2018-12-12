import java.util.ArrayList;
import java.util.List;

public class Utilisateur implements Observer {
	public int id;
	public String nom;
	public String prenom;
	public String ecole;
	public String mail;
	public String password;
	public List<Annonce> annonces;
	public List<Avis> liste_avis;
	public List<Commentaire> liste_commentaire;
	public PlatStore store;
	
	
	public Utilisateur(int id, String nom, String prenom, String ecole, String mail, String password, PlatStore store) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.ecole = ecole;
		this.mail = mail;
		this.password = password;
		this.liste_avis = new ArrayList<Avis>();
		this.annonces = new ArrayList<Annonce>();
		this.liste_commentaire = new ArrayList<Commentaire>();
		this.store = store;
	}

	public void deposerAnnonce(String adresse, String description, String titre) {
		Annonce an= new Annonce(adresse,description,titre,this);
		store.registerAnnonce(an);
		annonces.add(an);
	}
	
	public void supprimerAnnonce(Annonce an){
		annonces.remove(an);
	}
	
	public void consulterAnnonce() {
		store.getInformationFromAnnonces();
	}
	
	public List<Annonce> rechercherAnnonce(String filtre) {
		return store.rechercheFiltre(filtre);	
	}
	
	
	public void ajouterAvis(Avis av) {
		liste_avis.add(av);
	}
	
	public void supprimerAvis(Avis av){
		liste_avis.remove(av);
	}
	
	public void createCommentaire(String description) {
		Commentaire newComment = new Commentaire(description,this);
		liste_commentaire.add(newComment);
	}
	
	public void getCommentaireFromAnnonce(int id) {
		Annonce an = store.getInformationFromSpecificAnnonce(id);
		an.getInformationFromCommentaire();	
	}
	
	public void removeCommentaire(Commentaire com) {
		liste_commentaire.remove(com);
	}
	
	public void creerAvis(String description) {
		Avis newAvis = new Avis(description);
		this.ajouterAvis(newAvis);
	}
	
	public void consulterAvis() {
		for (Avis av: liste_avis){
			Logger.getInstance().info("Avis: "+ av.getDescription());		
		}
	}
	
	//This method comes from Observer interface
	public void updateFromLobby(String message){
		Logger.getInstance().info("Nouvelle information: " + message);
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the ecole
	 */
	public String getEcole() {
		return ecole;
	}

	/**
	 * @param ecole the ecole to set
	 */
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
