package spital.facade.clase;

public class Salon {
    private int numarSalon;
    private int numarPaturiDisponibile;
    private int numarPaturiOcupate;

    public Salon(int numarSalon, int numarPaturiDisponibile, int numarPaturiOcupate) {
        this.numarSalon = numarSalon;
        this.numarPaturiDisponibile = numarPaturiDisponibile;
        this.numarPaturiOcupate = numarPaturiOcupate;
    }

    public boolean verificarePatDisponibil(){
        if (numarPaturiDisponibile > numarPaturiOcupate){
            return true;
        } else {
            return false;
        }
    }
}
