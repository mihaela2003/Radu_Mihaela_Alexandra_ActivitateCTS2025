package serviceAuto.simpleFactory.clase;

public class Portbagaj implements IComponenta{
    private String volum;

    public Portbagaj(String volum) {
        this.volum = volum;
    }

    @Override
    public void descriere() {
        System.out.println("Portbagajul are volumul " + this.volum);
    }
}
