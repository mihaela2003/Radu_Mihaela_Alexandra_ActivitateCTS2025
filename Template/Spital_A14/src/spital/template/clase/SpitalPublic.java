package spital.template.clase;

public class SpitalPublic extends TemplateInternare{
    private String denumire;

    public SpitalPublic(String denumire) {
        this.denumire = denumire;
    }

    @Override
    int verificareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificareDisponibilitateSalon() {
        System.out.println("nu avem paturi disponibile");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost transferat la alt spital.");
    }
}
