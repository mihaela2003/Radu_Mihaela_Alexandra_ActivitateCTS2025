package ro.cts.program;

import ro.cts.clase.AdapterClaseMedicamente;
import ro.cts.clase.Farmacie;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");

        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Parasinus", "04.05.2025", true, 22.5f);
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie("Nurofen", "04.08.2028", true, 28.2f);

        farmacie.vindeMedicament(medicamentFarmacie);
        farmacie.vindeMedicament(medicamentFarmacie1);

        MedicamentSpital medicamentSpital = new MedicamentSpital("Paracetamol", 17.8f);

        AdapterClaseMedicamente adapterClaseMedicamente = new AdapterClaseMedicamente("Paracetamol", 17.8f);
        farmacie.vindeMedicament(adapterClaseMedicamente);
    }
}