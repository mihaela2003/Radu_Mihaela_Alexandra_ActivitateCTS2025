package banca.decorator.clase;

public class CardSimplu implements Card{
    private String nume;
    private float suma;

    public CardSimplu(String nume, float suma) {
        this.nume = nume;
        this.suma = suma;
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println(nume + " are pe card suma de " + suma + " lei");
    }
}
