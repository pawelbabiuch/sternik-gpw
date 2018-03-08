package pl.sternik.pb.gpw;

import java.util.Observer;

@SuppressWarnings("deprecation")
public interface ServerDanychGieldowych{
    
	void addObserver(Observer o);
    void symulujTransakcje();
}
