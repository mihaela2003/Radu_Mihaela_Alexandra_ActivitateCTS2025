package spitalFactoryMethod.main;

import spitalFactoryMethod.clase.PersonalSpital;
import spitalFactoryMethod.fabrici.*;

public class Main {
    public static void main(String[] args) {
        FabricaSpital fabrica = new FabricaPersonalMedical();
        FabricaSpital fabricaNON = new FabricaPersonalNonMedical();

        PersonalSpital personal = fabrica.creareSpital(TipPersonalMedical.MEDIC, "Gigel", "gigel@gmail.com");
        personal.descriere();
        personal = fabricaNON.creareSpital(TipPersonalNonMedical.SECRETAR, "Maricica", "maricica@gmail.com");
        personal.descriere();
    }
}