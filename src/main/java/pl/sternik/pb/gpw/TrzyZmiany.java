package pl.sternik.pb.gpw;

import java.util.ArrayList;
import java.util.List;

public class TrzyZmiany {

	private final byte MAX_TIK_COUNT = 3;
	
	private List<Tik> tiki;
	
	public TrzyZmiany(Tik tik) {
		tiki = new ArrayList<Tik>();
		tiki.add(tik);
	}
	
	public void dodajTik(Tik tik) {
		
		if(tiki.size() == MAX_TIK_COUNT) tiki.remove(0);
		tiki.add(tik);
	}
	
	public double obliczSrednia() {
		double srednia = 0;
		
		for(int i = 0; i < tiki.size(); i++) {
			srednia += tiki.get(i).getCena();
		}
		
		return srednia / tiki.size();
	}
}
