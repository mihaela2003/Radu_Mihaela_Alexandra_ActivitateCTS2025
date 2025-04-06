package autoritateReglementareMasiniStaticBlock.clase;

public class AutoritateReglementareMasini {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglementareMasini instance;

    static {
        try {
            instance = new AutoritateReglementareMasini("autoritate1", "www.website.ro", 8);
        } catch (Exception exception) {
            System.out.println("Instanta nu poate fi creata");
        }
    }

    public AutoritateReglementareMasini(String nume, String website, int nrReglementari) {
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

    public static AutoritateReglementareMasini getInstance(){
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
