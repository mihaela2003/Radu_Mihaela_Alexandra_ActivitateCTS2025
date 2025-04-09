package serviceAuto.simpleFactory.clase;

public class Usa implements IComponenta{
    private String culoare;

    public Usa(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void descriere() {
        System.out.println("Usa are culoarea " + this.culoare);
    }
}
