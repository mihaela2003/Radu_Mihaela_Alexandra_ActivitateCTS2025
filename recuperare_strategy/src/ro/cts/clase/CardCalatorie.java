package ro.cts.clase;

public class CardCalatorie implements IMetodaPlata{
    private int numarCalatoriiRamase;

    public CardCalatorie(int numarCalatoriiRamase) {
        this.numarCalatoriiRamase = numarCalatoriiRamase;
    }

    @Override
    public void realizeazaPlata(float pretBilet) {
        if(this.numarCalatoriiRamase > 0){
            System.out.println("Am platit cu cardul de calatorii");
            this.numarCalatoriiRamase -= 1;
        } else {
            System.out.println("Nu ai calatorii ramase.");
        }
    }
}
