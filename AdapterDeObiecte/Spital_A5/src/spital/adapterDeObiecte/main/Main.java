package spital.adapterDeObiecte.main;

import spital.adapterDeObiecte.clase.AdapterObiecteMedicamente;
import spital.adapterDeObiecte.clase.MedicamentFarmacie;
import spital.adapterDeObiecte.clase.MedicamentSpital;

public class Main {

    public static void vindeMedicamente(MedicamentFarmacie medicamentFarmacie){
        System.out.println("bine ati venit la farmacie");
        medicamentFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("med1", "12.12.1212", true, 12f);
        vindeMedicamente(medicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital("med2", 112f);
        AdapterObiecteMedicamente adapter = new AdapterObiecteMedicamente(medicamentSpital);
        vindeMedicamente(adapter);
    }
}