package autoritateReglementariAutoSerialization.clase;

import java.io.Serializable;

public class AutoritateReglementariAuto implements Serializable {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglementariAuto instance = null;

    public static AutoritateReglementariAuto getInstance(String nume, String website, int nrReglementari){
        if (instance == null) {
            instance = new AutoritateReglementariAuto(nume, website, nrReglementari);
        }
        return instance;
    }

    protected Object readResolve(){
        return getInstance("Nu conteaza", "Nici asta nu conteaza", 0);
    }

    public AutoritateReglementariAuto(String nume, String website, int nrReglementari) {
        this.nume = nume;
        this.website = website;
        this.nrReglementari = nrReglementari;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getNrReglementari() {
        return nrReglementari;
    }

    public void setNrReglementari(int nrReglementari) {
        this.nrReglementari = nrReglementari;
    }
}
