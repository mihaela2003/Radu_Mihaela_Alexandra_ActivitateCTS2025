package spital.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subiect{
    private List<Observer> listaPacienti;

    public Spital() {
        this.listaPacienti = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        listaPacienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        listaPacienti.remove(observer);
    }

    @Override
    public void notifica(String mesaj) {
        for(Observer observer: listaPacienti){
            observer.primesteNotificare(mesaj);
        }
    }
}
