package ro.cts.clase;

public class AdapterObiecteMedicamente extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public AdapterObiecteMedicamente(MedicamentSpital medicament) {
        super(medicament.getNumeMedicament(), "25.09.2022", true, medicament.getPret());
        this.medicamentSpital = medicament;
    }

    @Override
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
