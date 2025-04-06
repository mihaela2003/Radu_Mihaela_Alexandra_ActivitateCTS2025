package autoritateReglementareMasiniLazy.clase;

public class AutoritateReglementareMasiniLazy {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglementareMasiniLazy instance = null;

    public AutoritateReglementareMasiniLazy(String nume, String website, int nrReglementari) {
        this.nume = nume;
        this.website = website;
        this.nrReglementari = nrReglementari;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setNrReglementari(int nrReglementari) {
        this.nrReglementari = nrReglementari;
    }

    public void reglementeazaMasina(String nume){
        this.nrReglementari = this.nrReglementari + 1;
    }

    public static AutoritateReglementareMasiniLazy getInstance(String nume, String website){
        if(instance == null){
            instance = new AutoritateReglementareMasiniLazy(nume, website, 0);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateReglementareMasiniLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrReglementari=").append(nrReglementari);
        sb.append('}');
        return sb.toString();
    }
}
