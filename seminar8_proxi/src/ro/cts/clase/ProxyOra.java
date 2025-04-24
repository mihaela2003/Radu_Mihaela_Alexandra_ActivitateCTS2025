package ro.cts.clase;

public class ProxyOra implements IRezervare{
    private IRezervare rezerva;

    public ProxyOra(IRezervare rezerva) {
        this.rezerva = rezerva;
    }

    @Override
    public void rezervare(String numeClient, int numarPersoane, int ora) {
        if (ora >= 18){
            this.rezerva.rezervare(numeClient, numarPersoane, ora);
        } else {
            System.out.println("Nu este nevoie de rezervare");
        }
    }
}
