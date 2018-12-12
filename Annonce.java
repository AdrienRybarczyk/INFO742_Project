import java.util.concurrent.atomic.AtomicInteger;

public class Annonce {
	private static final AtomicInteger count = new AtomicInteger(0); //to avoid problem with thread
	private final int id;
	public String adresse;
	public String description;
	public String titre;
	public Utilisateur util;
	public boolean etat;
	
	
	public Annonce(String adresse, String description, String titre, Utilisateur util, boolean etat) {
		this.id = count.incrementAndGet(); 
		this.adresse = adresse;
		this.description = description;
		this.titre = titre;
		this.util = util;
		this.etat = etat;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
	/**
	 * @return the util
	 */
	public Utilisateur getUtil() {
		return util;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the etat
	 */
	public boolean isEtat() {
		return etat;
	}

	/**
	 * @param etat the etat to set
	 */
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	
	
}
