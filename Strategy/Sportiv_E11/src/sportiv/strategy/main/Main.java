package sportiv.strategy.main;

import sportiv.strategy.clase.*;

public class Main {
    public static void main(String[] args) {
        TipVerificare tip = new SpectatorPeluza();
        Spectator spectator = new Spectator("costel", tip);
        spectator.verificare();
        spectator.setTip(new SpectatorTribuna());
        spectator.verificare();
        spectator.setTip(new SpectatorVIP());
        spectator.verificare();
        spectator.setTip(tip);
        spectator.verificare();
    }
}