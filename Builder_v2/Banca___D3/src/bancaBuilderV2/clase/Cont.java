package bancaBuilderV2.clase;

public class Cont {
    private String nume;
    private boolean areSalariuPeCard;
    private boolean areCardAfisat;
    private boolean areInternetBanking;

    public Cont(String nume, boolean areSalariuPeCard, boolean areCardAfisat, boolean areInternetBanking) {
        this.nume = nume;
        this.areSalariuPeCard = areSalariuPeCard;
        this.areCardAfisat = areCardAfisat;
        this.areInternetBanking = areInternetBanking;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    protected void setAreSalariuPeCard(boolean areSalariuPeCard) {
        this.areSalariuPeCard = areSalariuPeCard;
    }

    protected void setAreCardAfisat(boolean areCardAfisat) {
        this.areCardAfisat = areCardAfisat;
    }

    protected void setAreInternetBanking(boolean areInternetBanking) {
        this.areInternetBanking = areInternetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", areSalariuPeCard=").append(areSalariuPeCard);
        sb.append(", areCardAfisat=").append(areCardAfisat);
        sb.append(", areInternetBanking=").append(areInternetBanking);
        sb.append('}');
        return sb.toString();
    }
}
