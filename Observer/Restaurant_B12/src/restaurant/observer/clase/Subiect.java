package restaurant.observer.clase;

public interface Subiect {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notifica(String mesaj);
}
