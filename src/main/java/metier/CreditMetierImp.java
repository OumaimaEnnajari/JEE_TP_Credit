package metier;

public class CreditMetierImp implements ICreditMetier   {
	
	

	@Override
	public double calculeCredit(float montant, float taux, int duree) {
		double res;
		
		res= (montant*taux/12)/(1-Math.pow((1+taux/12), -duree));
		return res;
	}

}
