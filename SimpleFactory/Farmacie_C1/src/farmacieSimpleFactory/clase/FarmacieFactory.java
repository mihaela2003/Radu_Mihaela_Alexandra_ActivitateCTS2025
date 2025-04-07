package farmacieSimpleFactory.clase;

public class FarmacieFactory {
    private float pret;
    private String denumire;

    public FarmacieFactory(float pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    public Medicament getFarmacie(TipMedicament tipMedicament){
        switch (tipMedicament){
            case RACEALA -> {
                return new Raceala(pret, denumire);
            }
            case DURERE -> {
                return new Durere(pret, denumire);
            }
            case BODY -> {
                return new Body(pret, denumire);
            }
            default -> {
                return null;
            }
        }
    }
}
