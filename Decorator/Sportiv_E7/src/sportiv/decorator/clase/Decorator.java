package sportiv.decorator.clase;

public abstract class Decorator implements Bilet{
    private Bilet bilet;

    public Decorator(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
        printeazaDecorat();
    }

    protected abstract void printeazaDecorat();
}
