package restaurant.chainOfResponsability.clase;

public class Libera extends Rezervare{
    @Override
    public void stareMasa() {
        System.out.println("masa a fost eliberata");
    }
}
