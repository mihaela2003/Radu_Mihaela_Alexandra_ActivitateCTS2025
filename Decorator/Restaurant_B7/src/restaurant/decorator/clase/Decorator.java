package restaurant.decorator.clase;

public abstract class Decorator implements Nota{
    private Nota nota;

    public Decorator(Nota nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
        printeazaDecorat();
    }

    protected abstract void printeazaDecorat();
}
