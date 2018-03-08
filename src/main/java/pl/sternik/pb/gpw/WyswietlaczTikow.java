package pl.sternik.pb.gpw;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class WyswietlaczTikow implements  Observer{

    @Override
    public void update(Observable o, Object arg) {
        Tik tik = (Tik) arg;
        System.out.println("WT:Spółka: " + tik.getNazwa() + " cena: " + tik.getCena());
    }
}
