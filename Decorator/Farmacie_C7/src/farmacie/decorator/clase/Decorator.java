package farmacie.decorator.clase;

public abstract class Decorator implements Bon{
    private Bon bon;

    public Decorator(Bon bon) {
        this.bon = bon;
    }

    @Override
    public void printeaza() {
        bon.printeaza();
        printeazaDecorat();
    }

    protected abstract void printeazaDecorat();
}
