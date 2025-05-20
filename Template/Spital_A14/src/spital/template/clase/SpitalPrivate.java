package spital.template.clase;

public class SpitalPrivate extends TemplateInternare{
    @Override
    int verificareDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificareDisponibilitateSalon() {
        System.out.println("avem paturi disponibile");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Se emite pacientul " + pacient.getNume());
    }
}
