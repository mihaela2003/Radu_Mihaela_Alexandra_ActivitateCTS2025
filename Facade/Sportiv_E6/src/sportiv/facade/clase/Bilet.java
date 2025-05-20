package sportiv.facade.clase;

public class Bilet {
    private String numePersoana;

    public Bilet(String numePersoana) {
        this.numePersoana = numePersoana;
    }

    public boolean verificareNumeBilet(Persoana persoana){
        if (numePersoana == persoana.getNume()) {
            return true;
        } else {
            return false;
        }
    }
}
