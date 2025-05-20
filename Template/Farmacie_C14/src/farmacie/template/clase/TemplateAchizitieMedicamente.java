package farmacie.template.clase;

public abstract class TemplateAchizitieMedicamente {
    public final void achizitieMedicamente(Medicament medicament){
        verificareReteta();
        if(verificareStoc(medicament)){
            incaseazaBani(medicament);
            scadeStocul(medicament);
            emitereBon(medicament);
        } else {
            System.out.println("nu avem medicamentul " + medicament.getDenumire() + " in stoc");
        }
    }

    abstract void verificareReteta();
    abstract boolean verificareStoc(Medicament medicament);
    abstract void incaseazaBani(Medicament medicament);
    abstract void scadeStocul(Medicament medicament);
    abstract void emitereBon(Medicament medicament);
}
