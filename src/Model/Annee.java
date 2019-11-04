package Model;

public class Annee {
	public String id;
	public String annee;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
	public Annee(String id, String annee) {
		super();
		this.id = id;
		this.annee = annee;
	}	
}
