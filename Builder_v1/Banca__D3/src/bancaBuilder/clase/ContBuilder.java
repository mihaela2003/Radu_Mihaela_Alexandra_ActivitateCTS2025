package bancaBuilder.clase;

public class ContBuilder implements ContAbstractBuilder{
    private String nume;
    private boolean areSalariuPeCard;
    private boolean areCardAfisat;
    private boolean areInternetBanking;

    public ContBuilder() {
        areSalariuPeCard = false;
        areCardAfisat = false;
        areInternetBanking = false;
    }

    public ContBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public ContBuilder setAreSalariuPeCard(boolean areSalariuPeCard) {
        this.areSalariuPeCard = areSalariuPeCard;
        return this;
    }

    public ContBuilder setAreCardAfisat(boolean areCardAfisat) {
        this.areCardAfisat = areCardAfisat;
        return this;
    }

    public ContBuilder setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
        return this;
    }

    @Override
    public Cont build(String nume) {
        return (new Cont(nume, areSalariuPeCard, areCardAfisat, areInternetBanking));
    }
}
