package spital.template.clase;

public abstract class TemplateInternare {
    public final void internare(Pacient pacient){
        if (verificareDificultate(pacient) < 3) {
            System.out.println("nu va putem interna");
        } else {
            verificareDisponibilitateSalon();
            emitereFisa(pacient);
        }
    }

    abstract int verificareDificultate(Pacient pacient);
    abstract void verificareDisponibilitateSalon();
    abstract void emitereFisa(Pacient pacient);
}
