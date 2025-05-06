package restaurantFlyweight.clase;

public class Client implements IClient{
    private int codClient;
    private String nume;
    private String numarTelefon;
    private String email;

    public Client(int codClient, String nume, String numarTelefon, String email) {
        super();
        this.codClient = codClient;
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("codClient=").append(codClient);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public void tiparire(Rezervare rezervare) {
        System.out.println(this.toString() + " " + rezervare.toString());
    }
}
