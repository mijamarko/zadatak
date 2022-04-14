import controllers.KorisnikController;
import entities.Korisnik;

public class Start {

	public static void main(String[] args) {
		
		Korisnik k1 = new Korisnik("marko", "marko123", "marko@gmail.com");
		Korisnik k2 = new Korisnik("ivana", "ivana123", "ivana@gmail.com");
		Korisnik k3 = new Korisnik("bojana", "bojana123", "bojana@gmail.com");
		Korisnik k4 = new Korisnik("nemanja", "nemanja123", "nemanja@gmail.com");
		
		KorisnikController kc = new KorisnikController();
		kc.save(k1);
		kc.save(k2);
		kc.save(k3);
		kc.save(k4);
		
	}

}
