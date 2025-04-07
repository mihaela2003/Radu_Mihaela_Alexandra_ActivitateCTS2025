package spitalFactoryMethod.fabrici;

import spitalFactoryMethod.clase.PersonalSpital;

public interface FabricaSpital {
    public PersonalSpital creareSpital(TipPersonal tipPersonal, String nume, String email);
}
