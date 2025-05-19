package spital.decorator.clase;

public abstract class Decorator implements Rezultate{
    private Rezultate rezultate;

    public Decorator(Rezultate rezultate) {
        this.rezultate = rezultate;
    }

    @Override
    public void descriere() {
        rezultate.descriere();
        printeaza();
    }

    protected abstract void printeaza();
}
