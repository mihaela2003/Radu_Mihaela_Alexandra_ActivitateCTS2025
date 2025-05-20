package farmacie.template.main;

import farmacie.template.clase.Catena;
import farmacie.template.clase.DrMax;
import farmacie.template.clase.Medicament;
import farmacie.template.clase.TemplateAchizitieMedicamente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Medicament paracetamol = new Medicament("paracetamol", 7, 15f);
        Medicament parasinus = new Medicament("parasinus", 0, 20f);
        Medicament streptosol = new Medicament("streptosol", 5, 30f);
        Medicament faringo = new Medicament("faringo", 10, 35f);

        List<Medicament> reteta = new ArrayList<Medicament>();
        reteta.add(paracetamol);
        reteta.add(parasinus);
        reteta.add(streptosol);
        reteta.add(faringo);

        TemplateAchizitieMedicamente catena = new Catena();
        for(Medicament medicament: reteta){
            catena.achizitieMedicamente(medicament);
        }

        TemplateAchizitieMedicamente drMax = new DrMax();
        for(Medicament medicament: reteta){
            drMax.achizitieMedicamente(medicament);
        }
    }
}