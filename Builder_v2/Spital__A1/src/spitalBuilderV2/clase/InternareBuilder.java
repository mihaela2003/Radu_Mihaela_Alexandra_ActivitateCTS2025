package spitalBuilderV2.clase;

public class InternareBuilder implements SpitalAbstractBuilder{
    private Internare internare;

    public InternareBuilder(String numePacient) {
        internare = new Internare(numePacient, false, false, false, false);
    }

    public InternareBuilder setArePatRabatabil(boolean arePatRabatabil) {
        internare.setArePatRabatabil(arePatRabatabil);
        return this;
    }

    public InternareBuilder setAreMicDejunInclus(boolean areMicDejunInclus) {
        internare.setAreMicDejunInclus(areMicDejunInclus);
        return this;
    }

    public InternareBuilder setArePapuciCamera(boolean arePapuciCamera) {
        internare.setArePapuciCamera(arePapuciCamera);
        return this;
    }

    public InternareBuilder setAreHalatInterior(boolean areHalatInterior) {
        internare.setAreHalatInterior(areHalatInterior);
        return this;
    }

    @Override
    public Internare build() {
        return internare;
    }
}
