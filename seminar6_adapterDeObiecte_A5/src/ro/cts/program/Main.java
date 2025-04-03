package ro.cts.program;

import ro.cts.clase.AdapterObiecteMedicamente;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

public class Main {

    public static void vindeMedicamente(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Bine ati venit la farmacia Dr Max");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("medicament1", "20.08.2025", true, 125.77f);
        vindeMedicamente(medicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital("medicament2", 118.99f);
        AdapterObiecteMedicamente adapter = new AdapterObiecteMedicamente(medicamentSpital);
        vindeMedicamente(adapter);
    }
}