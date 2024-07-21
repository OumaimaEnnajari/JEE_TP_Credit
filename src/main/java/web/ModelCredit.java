package web;

public class ModelCredit {
	
	private float taux;
	private int duree;
	private double credit;
	private float montant;
	
	
	public ModelCredit(float taux, int duree, double credit, float montant) {
		super();
		this.taux = taux;
		this.duree = duree;
		this.credit = credit;
		this.montant = montant;
	}
	
	public float getTaux() {
		return taux;
	}
	public void setTaux(float taux) {
		this.taux = taux;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	

}
