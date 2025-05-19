package restaurant.decorator.clase;

public class NotaAnulNou extends Decorator{
    public NotaAnulNou(Nota nota) {
        super(nota);
    }

    @Override
    protected void printeazaDecorat() {
        System.out.println("La multi ani!!!");
    }
}
