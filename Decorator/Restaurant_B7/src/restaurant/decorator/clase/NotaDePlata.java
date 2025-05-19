package restaurant.decorator.clase;

public class NotaDePlata implements Nota{
    private float sumaDePlata;

    public NotaDePlata(float sumaDePlata) {
        this.sumaDePlata = sumaDePlata;
    }

    @Override
    public void printeaza() {
        System.out.println("Suma de plata este de " + this.sumaDePlata);
    }
}
