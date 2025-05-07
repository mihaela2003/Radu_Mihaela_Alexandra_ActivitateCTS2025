package spitalStrategy.clase;

public class Pacient {
    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(double sumaDePlata){
        modPlata.plateste(nume, sumaDePlata);
    }
}
