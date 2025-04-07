package spitalFactoryMethod.fabrici;

import spitalFactoryMethod.clase.Brancardier;
import spitalFactoryMethod.clase.PersonalSpital;
import spitalFactoryMethod.clase.Registrator;
import spitalFactoryMethod.clase.Secretar;

public class FabricaPersonalNonMedical implements FabricaSpital{
    @Override
    public PersonalSpital creareSpital(TipPersonal tipPersonal, String nume, String email) {
        switch ((TipPersonalNonMedical) tipPersonal){
            case BRANCARDIER -> {
                return new Brancardier(nume, email);
            }
            case SECRETAR -> {
                return new Secretar(nume, email);
            }
            case REGISTRATOR -> {
                return new Registrator(nume, email);
            }
            default -> {
                return null;
            }
        }
    }
}
