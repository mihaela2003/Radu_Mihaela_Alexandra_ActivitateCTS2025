package farmacieBuilderV2.clase;

public class RetetaBuilder implements FarmacieAbstractBuilder{
    private Reteta reteta;

    public RetetaBuilder(String codReteta){
        reteta = new Reteta(codReteta, 0, false, false, 0);
    }

    public RetetaBuilder setNrPungi(int nrPungi) {
        reteta.setNrPungi(nrPungi);
        return this;
    }

    public RetetaBuilder setaPlatitCuCardul(boolean aPlatitCuCardul) {
        reteta.setaPlatitCuCardul(aPlatitCuCardul);
        return this;
    }

    public RetetaBuilder setAreCardFidelitate(boolean areCardFidelitate) {
        reteta.setAreCardFidelitate(areCardFidelitate);
        return this;
    }

    public RetetaBuilder setPlatitorTVA(float platitorTVA) {
        reteta.setPlatitorTVA(platitorTVA);
        return this;
    }

    @Override
    public Reteta build() {
        return reteta;
    }
}
