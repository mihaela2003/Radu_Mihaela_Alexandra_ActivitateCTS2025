package farmacie.strategy.clase;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteReteta(float sumaDePlata){
        modPlata.modPlata(nume, sumaDePlata);
    }
}
