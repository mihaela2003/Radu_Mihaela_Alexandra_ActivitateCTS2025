package sportiv.decorator.clase;

public class BiletEchipaLocala extends Decorator{
    public BiletEchipaLocala(Bilet bilet) {
        super(bilet);
    }

    @Override
    protected void printeazaDecorat() {
        System.out.println("noi sustinem echipa locala!!!");
    }
}
