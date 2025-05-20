package restaurant.chainOfResponsability.clase;

public abstract class Rezervare {
    private Rezervare rezervare;

    public Rezervare() {
        this.rezervare = null;
    }

    public Rezervare getUrmRezervare() {
        return rezervare;
    }

    public void setUrmRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    public abstract void stareMasa();
}
