package restaurant.proxy.clase;

public class Rezervare implements IRezervare{

    @Override
    public void rezervare(String numeClient, int numarPersoane, int ora) {
        System.out.println("Clientul " + numeClient + " a facut o rezervare de " + numarPersoane + " persoane la ora " + ora);
    }
}
