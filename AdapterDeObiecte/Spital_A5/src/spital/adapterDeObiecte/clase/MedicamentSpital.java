package spital.adapterDeObiecte.clase;

public class MedicamentSpital {
    private String denumire;
    private float pret;

    public MedicamentSpital(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("medicamentul " + this.denumire + " este achizitionat la pretul " + this.pret);
    }

    public void prezintaReteta(){
        System.out.println("este prezentata reteta pentru medicamentul " + this.denumire);
    }
}
