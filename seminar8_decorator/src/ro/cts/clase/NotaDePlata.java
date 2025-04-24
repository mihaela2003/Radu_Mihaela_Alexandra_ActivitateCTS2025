package ro.cts.clase;

public class NotaDePlata implements Nota{
    private float totalNota;

    public NotaDePlata(float totalNota) {
        this.totalNota = totalNota;
    }

    @Override
    public void printare() {
        System.out.println("Aveti de plata suma de " + totalNota + " RON");
    }
}
