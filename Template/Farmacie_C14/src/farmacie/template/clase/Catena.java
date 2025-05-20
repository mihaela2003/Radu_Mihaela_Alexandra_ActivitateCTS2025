package farmacie.template.clase;

public class Catena extends TemplateAchizitieMedicamente{
    @Override
    void verificareReteta() {
        System.out.println("O sa verificam daca medicamentul se afla in stoc");
    }

    @Override
    boolean verificareStoc(Medicament medicament) {
        if(medicament.getStoc() > 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    void incaseazaBani(Medicament medicament) {
        System.out.println("o sa incasam suma de " + medicament.getPret() + " pentru medicamentul " + medicament.getDenumire());
    }

    @Override
    void scadeStocul(Medicament medicament) {
        medicament.setStoc(medicament.getStoc() - 1);
    }

    @Override
    void emitereBon(Medicament medicament) {
        System.out.println("vom emite bonul pentru medicamentul  " + medicament.getDenumire());
    }
}
