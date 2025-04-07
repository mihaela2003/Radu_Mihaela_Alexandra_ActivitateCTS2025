package spitalFactoryMethod.fabrici;

import spitalFactoryMethod.clase.Asistent;
import spitalFactoryMethod.clase.Medic;
import spitalFactoryMethod.clase.PersonalSpital;

public class FabricaPersonalMedical implements FabricaSpital{

    @Override
    public PersonalSpital creareSpital(TipPersonal tipPersonal, String nume, String email) {
        switch ((TipPersonalMedical) tipPersonal){
            case MEDIC -> {
                return new Medic(nume, email);
            }
            case ASISTENT -> {
                return new Asistent(nume, email);
            }
            default -> {
                return null;
            }
        }
    }
}
