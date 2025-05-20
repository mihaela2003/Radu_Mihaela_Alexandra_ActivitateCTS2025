package restaurant.proxy.clase;

public class ProxyNumarPersoane implements IRezervare{
    private IRezervare rezervare;

    public ProxyNumarPersoane(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezervare(String numeClient, int numarPersoane, int ora) {
        if (numarPersoane >= 4){
            rezervare.rezervare(numeClient, numarPersoane, ora);
        } else {
            System.out.println("va poftim la restaurant, avem suficiente mese de 2 persoane");
        }
    }
}
