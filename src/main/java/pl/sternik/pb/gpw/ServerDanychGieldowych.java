package pl.sternik.pb.gpw;

import java.util.Observer;

public interface ServerDanychGieldowych {
    void addObserver(Observer o);

    void symulujTransakcje();
}
