package autoritateReglementareMasiniThreadSafe.clase;

public class AutoritateReglementareMasini {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglementareMasini instance = null;

    public AutoritateReglementareMasini(String nume, String website, int nrReglementari) {
        this.nume = nume;
        this.website = website;
        this.nrReglementari = nrReglementari;
    }

    public static AutoritateReglementareMasini getInstance(String nume, String website, int nrReglementari){
        if (instance == null){
            instance = new AutoritateReglementareMasini(nume, website, nrReglementari);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateReglementareMasini{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrReglementari=").append(nrReglementari);
        sb.append('}');
        return sb.toString();
    }
}
