package farmacie.adapterDeObiecte.clase;

public class AplicatieVanzare {
    private int idMedicament;
    private String denumireMedicament;
    private int stoc;
    private float pret;

    public AplicatieVanzare(int idMedicament,String denumireMedicament, int stoc, float pret) {
        this.idMedicament = idMedicament;
        this.denumireMedicament = denumireMedicament;
        this.stoc = stoc;
        this.pret = pret;
    }

    public float getPret() {
        return pret;
    }

    public int getIdMedicament() {
        return idMedicament;
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public int getStoc() {
        return stoc;
    }

    public void setareMedicament(int idMedicament){
        System.out.println("medicamentul" + this.denumireMedicament + " cu id-ul" + idMedicament + " a fost setat");
    }

    public boolean verificareDisponibilitate(int idMedicament, int numarMedicamenteDorite){
        setareMedicament(idMedicament);
        if(numarMedicamenteDorite <= stoc){
            stoc -= numarMedicamenteDorite;
            System.out.println("se poate achizitiona un numar de " + numarMedicamenteDorite + " din medicamentul " + this.denumireMedicament + " la pretul de " + this.pret);
            return true;
        } else {
            return false;
        }
    }

}
