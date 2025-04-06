package autoritateReglemetareMasiniEager.clase;

public class AutoritateReglementareMasiniEager {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglementareMasiniEager instance = new AutoritateReglementareMasiniEager("Autoritate1", "www.autoritate.ro", 200);

    private AutoritateReglementareMasiniEager(String nume, String website, int nrReglementari) {
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

    public void reglementeazaMasini(String nume){
        this.nrReglementari = this.nrReglementari+1;
    }

    public static AutoritateReglementareMasiniEager getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritateReglementareMasiniEager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrReglementari=").append(nrReglementari);
        sb.append('}');
        return sb.toString();
    }
}
