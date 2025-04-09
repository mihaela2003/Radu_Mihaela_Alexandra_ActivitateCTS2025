package serviceAuto.simpleFactory.clase;

public class Capota implements IComponenta{
    private String culoare;

    public Capota(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void descriere() {
        System.out.println("Capota are culoarea " + this.culoare);
    }
}
