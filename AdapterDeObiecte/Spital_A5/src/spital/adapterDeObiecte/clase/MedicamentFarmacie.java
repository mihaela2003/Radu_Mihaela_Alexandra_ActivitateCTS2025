package spital.adapterDeObiecte.clase;

public class MedicamentFarmacie {
    private String denumire;
    private String dataExpirare;
    private boolean esteInStoc;
    private float pret;

    public MedicamentFarmacie(String denumire, String dataExpirare, boolean esteInStoc, float pret) {
        this.denumire = denumire;
        this.dataExpirare = dataExpirare;
        this.esteInStoc = esteInStoc;
        this.pret = pret;
    }

    public void cumparaMedicament(){
        System.out.println("Medicamentul " + this.denumire + " care explira la " + this.dataExpirare + " are pretul de " + this.pret);
    }
}
