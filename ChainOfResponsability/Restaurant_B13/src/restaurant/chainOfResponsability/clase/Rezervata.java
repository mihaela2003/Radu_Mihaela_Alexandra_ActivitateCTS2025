package restaurant.chainOfResponsability.clase;

public class Rezervata extends Rezervare{
    @Override
    public void stareMasa() {
        System.out.println("masa a fost rezervata");
        this.getUrmRezervare().stareMasa();
    }
}
