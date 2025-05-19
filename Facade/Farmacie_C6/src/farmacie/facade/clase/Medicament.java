package farmacie.facade.clase;

public class Medicament {
    private String denumire;
    private int stoc;
    private float pret;

    public Medicament(float pret, int stoc, String denumire) {
        this.pret = pret;
        this.stoc = stoc;
        this.denumire = denumire;
    }

    public boolean verificareStocMedicament(){
        if (stoc > 0) {
            return true;
        } else {
            return false;
        }
    }
}
