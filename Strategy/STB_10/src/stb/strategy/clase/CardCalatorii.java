package stb.strategy.clase;

public class CardCalatorii implements ModPlata{
    private int numarCalatoriiRamasa;

    public CardCalatorii(int numarCalatoriiRamasa) {
        this.numarCalatoriiRamasa = numarCalatoriiRamasa;
    }


    @Override
    public void plateste(int sumaDePlata) {
        if(this.numarCalatoriiRamasa > 0){
            System.out.println("am platit cu cardul de calatorii");
            this.numarCalatoriiRamasa -= 1;
        } else {
            System.out.println("ai ramas fara calatorii");
        }
    }
}
