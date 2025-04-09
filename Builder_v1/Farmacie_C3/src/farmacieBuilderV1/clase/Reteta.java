package farmacieBuilderV1.clase;

public class Reteta {
    private String codReteta;
    private int nrPungi;
    private boolean aPlatitCuCardul;
    private boolean areCardFidelitate;
    private float platitorTVA;

    public Reteta(String codReteta, int nrPungi, boolean aPlatitCuCardul, boolean areCardFidelitate, float platitorTVA) {
        this.codReteta = codReteta;
        this.nrPungi = nrPungi;
        this.aPlatitCuCardul = aPlatitCuCardul;
        this.areCardFidelitate = areCardFidelitate;
        this.platitorTVA = platitorTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("codReteta='").append(codReteta).append('\'');
        sb.append(", nrPungi=").append(nrPungi);
        sb.append(", aPlatitCuCardul=").append(aPlatitCuCardul);
        sb.append(", areCardFidelitate=").append(areCardFidelitate);
        sb.append(", platitorTVA=").append(platitorTVA);
        sb.append('}');
        return sb.toString();
    }
}
