package stb.decorator.clase;

public class BiletZiNationala extends Decorator{
    public BiletZiNationala(Bilet bilet) {
        super(bilet);
    }

    @Override
    protected void printeazaDecorat() {
        System.out.println("La multi ani!!!");
    }
}
