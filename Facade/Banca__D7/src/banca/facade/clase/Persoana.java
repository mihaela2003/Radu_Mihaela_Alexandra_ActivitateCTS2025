package banca.facade.clase;

public class Persoana {
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public boolean verificaVarsta(){
        if (varsta > 18){
            return true;
        } else {
            return false;
        }
    }
}
