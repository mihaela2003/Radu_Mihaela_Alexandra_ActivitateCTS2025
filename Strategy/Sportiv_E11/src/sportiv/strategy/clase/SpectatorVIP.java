package sportiv.strategy.clase;

public class SpectatorVIP implements TipVerificare{
    @Override
    public void tipVerificare() {
        System.out.println("se va efectua doar verificarea biletului");
    }
}
