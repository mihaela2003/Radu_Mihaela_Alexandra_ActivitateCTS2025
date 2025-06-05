package testareUnitara.dubluri;

import testareUnitara.clase.IPersoana;

public class PersoanaStub implements IPersoana {

    @Override
    public String getSex() {
        return "";
    }

    @Override
    public int getVarsta() {
        return 65;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
