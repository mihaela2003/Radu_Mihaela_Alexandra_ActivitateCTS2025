package banca.decorator.clase;

public abstract class Decorator implements Card{
    private Card card;

    public Decorator(Card card) {
        this.card = card;
    }

    @Override
    public void afiseazaInformatii() {
        card.afiseazaInformatii();
        printeazaDecorat();
    }

    protected abstract void printeazaDecorat();
}
