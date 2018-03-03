package pl.sternik.pb.gpw;

import java.util.Observable;

public final class GpwServer extends Observable implements ServerDanychGieldowych {

	private final Tik[] tiki;
	private final int licznikMax = 10;
	private int licznik;
	
	public GpwServer() {
		tiki = new Tik[licznikMax];
		
		tiki[0] = new Tik("ABC", 123);
		tiki[1] = new Tik("DEF", 345);
		tiki[2] = new Tik("GHI", 567);
		tiki[3] = new Tik("JKL", 789);
		tiki[4] = new Tik("MNO", 101);
		tiki[5] = new Tik("PRS", 202);
		tiki[6] = new Tik("TUW", 304);
		tiki[7] = new Tik("XYZ", 502);
		tiki[8] = new Tik("Q1A", 607);
		tiki[9] = new Tik("Q2B", 889);
	}
	
	@Override
	public void symulujTransakcje() {
		// TODO Auto-generated method stub
		
	}

}
