package ro.cts.clase;

public class Rezervare implements IRezervare{

    @Override
    public void rezervare(String numeClient, int numarPersoane, int ora) {
        System.out.println("Clientul " + numeClient + " are o rezervare de " + numarPersoane + " persoane la ora " + ora);
    }
}
