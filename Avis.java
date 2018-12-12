import java.util.concurrent.atomic.AtomicInteger;

public class Avis {
	private static final AtomicInteger count = new AtomicInteger(0); //to avoid problem with thread
	private int id;
	public String description;
	
	public Avis(String description) {
		this.id = count.incrementAndGet(); 
		this.description = description;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	
}
