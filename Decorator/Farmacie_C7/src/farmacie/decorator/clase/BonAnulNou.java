package farmacie.decorator.clase;

public class BonAnulNou extends Decorator{
    public BonAnulNou(Bon bon) {
        super(bon);
    }

    @Override
    protected void printeazaDecorat() {
        System.out.println("La multi ani!!!");
    }
}
