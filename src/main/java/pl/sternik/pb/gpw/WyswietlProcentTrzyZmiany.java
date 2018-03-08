package pl.sternik.pb.gpw;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class WyswietlProcentTrzyZmiany implements Observer{

	private Map<String, TrzyZmiany> tiki = new HashMap<String, TrzyZmiany>();
	
	@Override
	public void update(Observable o, Object arg) {
		Tik tik = (Tik)arg;
		TrzyZmiany trzyZmiany = tiki.get(tik.getNazwa());
		
		if(trzyZmiany != null) {
			trzyZmiany.dodajTik(tik);
			System.out.println("PZ:Spółka: " + tik.getNazwa() + " zmiana 3 ostatnich: " + trzyZmiany.obliczSrednia() + "%");
		}
		else {
			trzyZmiany = new TrzyZmiany(tik);
		}
		
		tiki.put(tik.getNazwa(), trzyZmiany);
	}

}
