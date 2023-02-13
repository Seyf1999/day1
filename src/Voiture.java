import java.time.LocalDate;

public class Voiture {
	String marque,modele;
	LocalDate dateImmatriculation;
	int vitessMaw;
	static int nbreVoitureCree=120;
	
	
	public Voiture(String m,String mo,LocalDate imm) {
		this.marque=m;
		this.modele=mo;
		this.dateImmatriculation=imm;
		
	}
	public void affiche() {
		System.out.println("marque: "+this.marque);
		System.out.println("modele: "+this.modele);
		System.out.println("dateImmatriculation: "+this.dateImmatriculation);
		
		
	}
	

}
