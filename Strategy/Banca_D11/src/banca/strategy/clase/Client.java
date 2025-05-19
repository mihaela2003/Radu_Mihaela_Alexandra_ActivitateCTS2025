package banca.strategy.clase;

public class Client {
    private String nume;
    private TipClient tipClient;

    public Client(String nume, TipClient tipClient) {
        this.nume = nume;
        this.tipClient = tipClient;
    }

    public void setTipClient(TipClient tipClient) {
        this.tipClient = tipClient;
    }

    public void trimiteActeCatreVerificare(){
        tipClient.solicitareDocumente();
    }
}
