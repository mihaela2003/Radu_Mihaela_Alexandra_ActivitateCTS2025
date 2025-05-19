package stb.strategy.clase;

public class Calator {
    private String nume;
    private ModPlata modPlata;

    public Calator(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteBilet(int pretBilet){
        modPlata.plateste(pretBilet);
    }
}
