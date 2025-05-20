package farmacie.template.clase;

public class Medicament {
    private String denumire;
    private int stoc;
    private float pret;

    public Medicament(String denumire, int stoc, float pret) {
        this.denumire = denumire;
        this.stoc = stoc;
        this.pret = pret;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getStoc() {
        return stoc;
    }

    public float getPret() {
        return pret;
    }


}
