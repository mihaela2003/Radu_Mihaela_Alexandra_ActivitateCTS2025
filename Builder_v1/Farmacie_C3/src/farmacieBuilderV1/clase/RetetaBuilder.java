package farmacieBuilderV1.clase;

public class RetetaBuilder implements FarmacieAbstractBuilder{
    private String codReteta;
    private int nrPungi;
    private boolean aPlatitCuCardul;
    private boolean areCardFidelitate;
    private float platitorTVA;

    public RetetaBuilder() {
        nrPungi = 0;
        aPlatitCuCardul = false;
        areCardFidelitate = false;
        platitorTVA = 0;
    }

    public RetetaBuilder setCodReteta(String codReteta) {
        this.codReteta = codReteta;
        return this;
    }

    public RetetaBuilder setNrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
        return this;
    }

    public RetetaBuilder setaPlatitCuCardul(boolean aPlatitCuCardul) {
        this.aPlatitCuCardul = aPlatitCuCardul;
        return this;
    }

    public RetetaBuilder setAreCardFidelitate(boolean areCardFidelitate) {
        this.areCardFidelitate = areCardFidelitate;
        return this;
    }

    public RetetaBuilder setPlatitorTVA(float platitorTVA) {
        this.platitorTVA = platitorTVA;
        return this;
    }

    @Override
    public Reteta build(String codReteta) {
        return (new Reteta(codReteta, nrPungi, aPlatitCuCardul, areCardFidelitate, platitorTVA));
    }
}
