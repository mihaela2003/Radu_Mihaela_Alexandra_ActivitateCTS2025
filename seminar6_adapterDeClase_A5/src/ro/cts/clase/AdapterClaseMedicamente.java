package ro.cts.clase;

public class AdapterClaseMedicamente extends MedicamentSpital implements IMedicamentFarmacie{

    public AdapterClaseMedicamente(String numeMedicament, float pret) {
        super(numeMedicament, pret);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
