package sportiv.strategy.clase;

public class Spectator {
    private String nume;
    private TipVerificare tip;

    public Spectator(String nume, TipVerificare tip) {
        this.nume = nume;
        this.tip = tip;
    }

    public void setTip(TipVerificare tip) {
        this.tip = tip;
    }

    public void verificare(){
        tip.tipVerificare();
    }
}
