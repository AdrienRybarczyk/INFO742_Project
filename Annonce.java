
public class Annonce {
	public int id;
	public String adresse;
	public String description;
	public String titre;
	public Utilisateur util;
	public boolean etat;
	
	
	public Annonce(int id, String adresse, String description, String titre, Utilisateur util, boolean etat) {
		this.id = id;
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
