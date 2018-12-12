import java.util.ArrayList;
import java.util.List;

public class PlatStore extends Lobby{
	public List<Annonce> liste_annonces;
	

	public PlatStore() {
		this.liste_annonces = new ArrayList<Annonce>();
	}

	// Add plat to the list
	public void registerAnnonce(Annonce an){
		liste_annonces.add(an);
		String lastNews="A announcement has been added" + an.getTitre() + " about " + an.getDescription();
		notifyObservers(lastNews);
	}
	
	// Remove plat from the list
	public void removeAnnonce(Annonce an){
		liste_annonces.remove(an);
		String lastNews="A announcement has been deleted " + an.getTitre() + " about " + an.getDescription();
		notifyObservers(lastNews);
	}
	
	public void getInformationFromAnnonces() {
		for (Annonce an: liste_annonces){
			Logger.getInstance().info("Titre: "+ an.getTitre() +" From Utilisateur " + an.getUtil().getNom() + an.getUtil().getPrenom() + " about " + an.getDescription() + " at " + an.getAdresse() + " etat " + an.isEtat());
		}	
	}
	
	public Annonce getInformationFromSpecificAnnonce(int id) {
		for (Annonce an: liste_annonces){
			if(an.getId()==id) {
				return an;
			}
		}
		return null;
	}
	
	public List<Annonce> getListeAnnonceDisponible(){
		List<Annonce> annoncedispo = new ArrayList<Annonce>();
		for (Annonce an: liste_annonces){
			if(an.isEtat()==true) {
				annoncedispo.add(an);
			}
		}
		return annoncedispo;
	}
	
	public List<Annonce> rechercheFiltre(String filtre){
		List<Annonce> annoncefiltre = new ArrayList<Annonce>();
		for (Annonce an: liste_annonces){
			if(an.getTitre().contains(filtre)==true || an.getDescription().contains(filtre)==true) {
				annoncefiltre.add(an);
			}
		}
		return annoncefiltre;
	}
}
