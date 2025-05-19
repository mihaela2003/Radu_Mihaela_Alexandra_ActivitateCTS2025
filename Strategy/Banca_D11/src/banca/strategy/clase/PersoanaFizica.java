package banca.strategy.clase;

public class PersoanaFizica implements TipClient{
    @Override
    public void solicitareDocumente() {
        System.out.println("se solicita doar buletinul si adeverinta de la munca");
    }
}
