package serviceAuto.simpleFactory.clase;

public class Bara implements IComponenta{
    private String parte;

    public Bara(String parte) {
        this.parte = parte;
    }

    @Override
    public void descriere() {
        System.out.println("Bara se afla in partea " + this.parte);
    }
}
