package farmacie.flyweight.clase;

public class Client implements IClient{
    private int codClient;
    private String nume;
    private int numarAsigurare;

    public Client(int codClient, String nume, int numarAsigurare) {
        this.codClient = codClient;
        this.nume = nume;
        this.numarAsigurare = numarAsigurare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("codClient=").append(codClient);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", numarAsigurare=").append(numarAsigurare);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Reteta reteta) {
        System.out.println(this.toString() + reteta.toString());
    }
}
