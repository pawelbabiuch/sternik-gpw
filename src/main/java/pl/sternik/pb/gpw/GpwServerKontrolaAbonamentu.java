package pl.sternik.pb.gpw;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

@SuppressWarnings("deprecation")
public class GpwServerKontrolaAbonamentu extends Observable implements Observer, ServerDanychGieldowych {

	private final ServerDanychGieldowych gpwServer;
	private final Set<String> abonament = new HashSet<String>();
	
	public GpwServerKontrolaAbonamentu(ServerDanychGieldowych server, String shareName) {
		this.gpwServer = server;
		server.addObserver(this);
		abonament.add(shareName);
	}
	
	@Override
	public void symulujTransakcje() {
		gpwServer.symulujTransakcje();

	}

	@Override
	public void update(Observable o, Object arg) {
		Tik tik = (Tik)arg;
		
		if(abonament.contains(tik.getNazwa())) {
			setChanged();
			notifyObservers(tik);
		}
	}
}
