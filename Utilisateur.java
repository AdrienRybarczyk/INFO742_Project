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
	public PlatStore store;
	
	
	public void deposerAnnonce(Annonce an) {
		annonces.add(an);
	}
	
	public void supprimerAnnonce(Annonce an){
		annonces.remove(an);
	}
	
	public void consulterAnnonce() {
		store.getInformationFromAnnonces();
	}
	
	public void creerAvis(String description) {
		int lastId= liste_avis.get(liste_avis.size()-1).id;
		Avis newAvis = new Avis(lastId+1, description);
	}
	
	public void consulterAvis() {
		for (Avis av: liste_avis){
			
			
		}
	}
	
	//This method comes from Observer interface
	public void updateFromLobby(String message){
		Logger.getInstance().info("Nouvelle information: " + message);
	}
}
