package spital.template.main;

import spital.template.clase.Pacient;
import spital.template.clase.SpitalPrivate;
import spital.template.clase.SpitalPublic;
import spital.template.clase.TemplateInternare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("gigel", 5);
        TemplateInternare spitalPublic = new SpitalPublic("spital");
        spitalPublic.internare(pacient);

        TemplateInternare spitalPrivat = new SpitalPrivate();
        spitalPrivat.internare(pacient);
    }
}