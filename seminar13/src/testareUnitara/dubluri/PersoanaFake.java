package testareUnitara.dubluri;

import testareUnitara.clase.IPersoana;

public class PersoanaFake implements IPersoana {
    private int varsta = 22;

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String getSex() {
        return "";
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
}
