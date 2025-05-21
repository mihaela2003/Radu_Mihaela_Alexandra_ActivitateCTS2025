package spital.adapterDeObiecte.clase;

public class AdapterObiecteMedicamente extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public AdapterObiecteMedicamente(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getDenumire(), "25.04.2026", true, medicamentSpital.getPret());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
