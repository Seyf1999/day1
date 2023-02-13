import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate im=LocalDate.of(2000, 10, 20);
		LocalDate im1=LocalDate.of(2023, 10, 20);
		LocalDate im2=LocalDate.of(2010, 10, 20);
		Voiture v1 =new Voiture("golf","volsvagen",im);
		Voiture v2 =new Voiture("Maruti","Suzuki",im1);
		Voiture v3 =new Voiture("yaris","Toyota",im2);
		v1.affiche();
		v2.affiche();
		v3.affiche();
		
		System.out.println(v1.nbreVoitureCree);
		System.out.println(v2.nbreVoitureCree);
		System.out.println(v3.nbreVoitureCree);
		
		
	}

}
