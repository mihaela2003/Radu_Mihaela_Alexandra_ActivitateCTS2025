package banca.flywieght.clase;

public class Detinator implements IDetinator{
    private String nume;
    private String adresa;
    private String numarTelefon;
    private String email;

    public Detinator(String nume, String adresa, String numarTelefon, String email) {
        this.nume = nume;
        this.adresa = adresa;
        this.numarTelefon = numarTelefon;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Detinator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Informatie informatie) {
        System.out.println(this.toString() + " " + informatie.toString());
    }
}
