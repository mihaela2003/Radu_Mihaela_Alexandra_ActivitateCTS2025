package sportivSimpleFactory.clase;

public class SportivFactory {
    private String nume;
    private int salariu;

    public SportivFactory(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    public Jucator getSportiv(TipSportiv tipSportiv){
        switch (tipSportiv){
            case PORTAR -> {
                return new Portar(nume, salariu);
            }
            case FUNDAS -> {
                return new Fundas(nume, salariu);
            }
            case ATACANT -> {
                return new Atacant(nume, salariu);
            }
            default -> {
                return null;
            }
        }
    }
}
