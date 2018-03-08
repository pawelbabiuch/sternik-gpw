package pl.sternik.pb.gpw;

public final class PanelTradera {


	private static ServerDanychGieldowych GPW_SERVER = new GpwServer();
	private static ServerDanychGieldowych PROXY_ABONAMENT_PKO = new GpwServerKontrolaAbonamentu(GPW_SERVER, "PKO");
	private static ServerDanychGieldowych PROXY_ABONAMENT_KGH = new GpwServerKontrolaAbonamentu(GPW_SERVER, "KGH");
	
	private final WyswietlaczTikow wyswietlaczTikow = new WyswietlaczTikow();
	private final WyswietlProcentZmiany wyswietlaczProcentZmiany = new WyswietlProcentZmiany();
	private final WyswietlProcentTrzyZmiany wyswietlaczProcentTrzyZmiany = new WyswietlProcentTrzyZmiany();
	
	private static final int ILE_POZYCJI = 51;

	private PanelTradera(ServerDanychGieldowych server) {
	    server.addObserver(wyswietlaczTikow);
	    server.addObserver(wyswietlaczProcentZmiany);
	    server.addObserver(wyswietlaczProcentTrzyZmiany);
	}

	public static void main(String[] args) {

	//	new PanelTradera(PanelTradera.GPW_SERVER);
		
		new PanelTradera(PanelTradera.PROXY_ABONAMENT_PKO);
		new PanelTradera(PanelTradera.PROXY_ABONAMENT_KGH);
		
		for (int i = 0; i < ILE_POZYCJI; i++) {
			PanelTradera.GPW_SERVER.symulujTransakcje();
			//PanelTradera.PROXY_ABONAMENT_PKO.symulujTransakcje();
		}

	}
}
