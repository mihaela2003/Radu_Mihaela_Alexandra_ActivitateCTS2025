package banca.decorator.clase;

public class CardContactLess extends Decorator{
    public CardContactLess(Card card) {
        super(card);
    }

    @Override
    protected void printeazaDecorat() {
        System.out.println("puteti plati cu acest card si contactless");
    }
}
