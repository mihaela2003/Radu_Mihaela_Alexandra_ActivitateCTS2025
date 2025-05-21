package farmacie.adapterDeObiecte.clase;

public class AdapterAplicatie extends AplicatieStocuri{
    private AplicatieVanzare aplicatieVanzare;

    public AdapterAplicatie(AplicatieVanzare aplicatieVanzare) {
        super(aplicatieVanzare.getIdMedicament(), aplicatieVanzare.getDenumireMedicament(), aplicatieVanzare.getStoc());
        this.aplicatieVanzare = aplicatieVanzare;
    }
}
