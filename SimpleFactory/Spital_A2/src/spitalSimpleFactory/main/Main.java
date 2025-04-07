package spitalSimpleFactory.main;

import spitalSimpleFactory.clase.PersonalSpital;
import spitalSimpleFactory.clase.SpitalFactory;
import spitalSimpleFactory.clase.TipPersonal;

public class Main {
    public static void main(String[] args) {
        SpitalFactory spitalFactory = new SpitalFactory("Gigel", "gigel@gmail.com");
        PersonalSpital brancardier = spitalFactory.getSpital(TipPersonal.BRANCARDIER);
        PersonalSpital asistent = spitalFactory.getSpital(TipPersonal.ASISTENT);
        PersonalSpital medic = spitalFactory.getSpital(TipPersonal.MEDIC);
        brancardier.descriere();
        asistent.descriere();
        medic.descriere();
    }
}