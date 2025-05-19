package stb.decorator.clase;

public class BiletNormal implements Bilet{
    private float suma;

    public BiletNormal(float suma) {
        this.suma = suma;
    }

    @Override
    public void printeaza() {
        System.out.println("biletul a costat suma de " + suma + " lei");
    }
}
