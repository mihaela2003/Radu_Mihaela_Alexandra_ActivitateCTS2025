package spitalFlyweight.clase;

public class Pacient implements IPacient{
    private int codPacient;
    private String nume;
    private String numarTelefon;
    private String adresa;

    public Pacient(String nume, String numarTelefon, String adresa, int codPacient) {
        super();
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
        this.codPacient = codPacient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("codPacient=").append(codPacient);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Internare internare) {
        System.out.println(this.toString() + " " + internare.toString());
    }
}
