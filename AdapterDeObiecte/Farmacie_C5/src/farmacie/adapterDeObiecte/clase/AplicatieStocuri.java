package farmacie.adapterDeObiecte.clase;

public class AplicatieStocuri {
    private int idMedicament;
    private String denumireMedicament;
    private int stoc;

    public AplicatieStocuri(int idMedicament, String denumireMedicament, int stoc) {
        this.idMedicament = idMedicament;
        this.denumireMedicament = denumireMedicament;
        this.stoc = stoc;
    }

    public boolean verificaStocPentruMedicament(int idMedicament, int numarDoritMedicamente){
        if (numarDoritMedicamente <= stoc){
            System.out.println("se poate achizitiona medicamentul " + this.denumireMedicament + " cu id-ul " + idMedicament);
            return true;
        } else {
            return false;
        }
    }
}
