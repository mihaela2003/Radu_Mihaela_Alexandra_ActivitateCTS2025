package spitalComposite.program;

import spitalComposite.clase.Departament;
import spitalComposite.clase.ISpital;
import spitalComposite.clase.Sectie;

public class Main {
    public static void main(String[] args) {
        ISpital departament1 = new Departament("asdfg");
        ISpital departament2 = new Departament("ert");

        ISpital sectie1 = new Sectie("ff");
        ISpital sectie2 = new Sectie("ffs");
        departament1.adaugaDepartament(sectie1);
        departament1.adaugaDepartament(sectie2);
        departament1.descriere();

        ISpital sectie3 = new Sectie("sfghd");
        departament2.adaugaDepartament(sectie3);
        departament2.descriere();

        departament1.stergeDepartament(sectie1);
        departament2.adaugaDepartament(sectie1);
        departament1.descriere();
        departament2.descriere();
    }
}