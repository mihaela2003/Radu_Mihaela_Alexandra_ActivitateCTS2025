package bancaBuilderV2.clase;

public class ContBuilder implements ContAbstractBuilder{
    private Cont cont;

    public ContBuilder(String nume) {
        cont = new Cont(nume, false, false, false);
    }

    public ContBuilder setAreSalariuPeCard(boolean areSalariuPeCard) {
        cont.setAreSalariuPeCard(areSalariuPeCard);
        return this;
    }

    public ContBuilder setAreCardAfisat(boolean areCardAfisat) {
        cont.setAreCardAfisat(areCardAfisat);
        return this;
    }

    public ContBuilder setAreInternetBanking(boolean areInternetBanking) {
        cont.setAreInternetBanking(areInternetBanking);
        return this;
    }

    @Override
    public Cont build() {
        return cont;
    }
}
