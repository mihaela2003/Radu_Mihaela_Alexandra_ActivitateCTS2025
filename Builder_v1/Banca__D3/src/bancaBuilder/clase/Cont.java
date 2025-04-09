package bancaBuilder.clase;

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
