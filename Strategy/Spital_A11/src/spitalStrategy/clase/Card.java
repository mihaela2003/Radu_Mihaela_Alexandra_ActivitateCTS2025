package spitalStrategy.clase;

public class Card implements ModPlata{
    @Override
    public void plateste(String nume, double suma) {
        System.out.println(nume + " plateste folosind cardul suma de " + suma + " RON.");
    }
}
