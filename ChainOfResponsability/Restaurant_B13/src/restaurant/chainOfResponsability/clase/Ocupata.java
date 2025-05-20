package restaurant.chainOfResponsability.clase;

public class Ocupata extends Rezervare{
    @Override
    public void stareMasa() {
        System.out.println("masa a fost ocupata");
        this.getUrmRezervare().stareMasa();
    }
}
