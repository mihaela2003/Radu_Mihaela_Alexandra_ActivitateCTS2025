package ro.cts.clase;

public class ProxyNumarPersoane implements IRezervare{
    private IRezervare rezerva;

    public ProxyNumarPersoane(IRezervare rezervare) {
        this.rezerva = rezervare;
    }

    @Override
    public void rezervare(String numeClient, int numarPersoane, int ora) {
           if (numarPersoane > 4){
               rezerva.rezervare(numeClient, numarPersoane, ora);
           } else {
               System.out.println("Va asteptam la restaurant!");
           }
    }
}
