package ro.cts.clase;

public class Calator {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        metodaPlata = new CardBancar(100); // mod implicit card bancar
    }
//nu este specificat nimic
    public Calator(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata; // metoda de plata este specificata de utilizator in main
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteBilet(float pretBilet){
        metodaPlata.realizeazaPlata(pretBilet);
    }
}
