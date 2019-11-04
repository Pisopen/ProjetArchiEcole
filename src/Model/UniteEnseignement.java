package Model;

public class UniteEnseignement {

	public String id;
	public String code;
	public String intitule;
	public float cours;
	public float td;
	public float tp;
	public float valeur;
	
	public UniteEnseignement(String id, String code, String intitule, float cours, float td, float tp, float valeur) {
		super();
		this.id = id;
		this.code = code;
		this.intitule = intitule;
		this.cours = cours;
		this.td = td;
		this.tp = tp;
		this.valeur = valeur;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public float getCours() {
		return cours;
	}
	public void setCours(float cours) {
		this.cours = cours;
	}
	public float getTd() {
		return td;
	}
	public void setTd(float td) {
		this.td = td;
	}
	public float getTp() {
		return tp;
	}
	public void setTp(float tp) {
		this.tp = tp;
	}
	public float getValeur() {
		return valeur;
	}
	public void setValeur(float valeur) {
		this.valeur = valeur;
	}
}
