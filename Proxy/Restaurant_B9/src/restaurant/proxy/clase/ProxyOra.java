package restaurant.proxy.clase;

public class ProxyOra implements IRezervare{
    private IRezervare rezervare;

    public ProxyOra(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezervare(String numeClient, int numarPersoane, int ora) {
        if (ora < 22){
            rezervare.rezervare(numeClient, numarPersoane, ora);
        } else {
            System.out.println("nu va putem face rezervare la ora aceea");
        }
    }
}
