package farmacie.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements Subiect{
    private List<Observer> listaClienti;

    public Farmacie(){
        listaClienti = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        listaClienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        listaClienti.remove(observer);
    }

    @Override
    public void notifica(String mesaj) {
        for (Observer observer: listaClienti){
            observer.primesteNotificare(mesaj);
        }
    }
}
