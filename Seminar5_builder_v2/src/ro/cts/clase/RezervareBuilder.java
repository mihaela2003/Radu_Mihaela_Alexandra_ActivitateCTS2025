package ro.cts.clase;

public class RezervareBuilder implements AbstractBuilder{
    private Rezervare rezervare;

    public RezervareBuilder(String numeClient) {
        rezervare = new Rezervare(numeClient, false, false, false, "faraMuzica");
    }

    public RezervareBuilder setHasScauneErg(boolean val){
        rezervare.setHasScauneErg(val);
        return this;
    }

    public RezervareBuilder setHasAsezareGeam(boolean val){
        rezervare.setHasAsezareGeam(val);
        return this;
    }

    public RezervareBuilder setHasMasaDecorata(boolean val){
        rezervare.setHasMasaDecorata(val);
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica){
        rezervare.setGenMuzica(genMuzica);
        return this;
    }


    @Override
    public Rezervare build() {
        return rezervare;
    }
}
