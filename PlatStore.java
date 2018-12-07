import java.util.List;

public class PlatStore {
	public List<Annonce> liste_annonces;
	
	
	// Add plat to the list
	public void registerAnnonce(Annonce an){
		liste_annonces.add(an);
	}
	
	// Remove plat from the list
	public void removeAnnonce(Annonce an){
		liste_annonces.remove(an);
	}
	
	public void getInformationFromAnnonces() {
		for (Annonce an: liste_annonces){
			
		
		}
		
	}
}
