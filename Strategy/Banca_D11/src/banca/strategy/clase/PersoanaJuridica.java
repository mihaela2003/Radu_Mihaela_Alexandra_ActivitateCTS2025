package banca.strategy.clase;

public class PersoanaJuridica implements TipClient{
    @Override
    public void solicitareDocumente() {
        System.out.println("se solicita actele de infiintare a firmei si dovada inregistrarii la ONRC");
    }
}
