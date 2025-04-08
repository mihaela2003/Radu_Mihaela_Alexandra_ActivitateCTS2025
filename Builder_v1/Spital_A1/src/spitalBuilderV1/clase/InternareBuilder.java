package spitalBuilderV1.clase;

public class InternareBuilder implements SpitalAbstractBuilder{
    private String numePacient;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciCamera;
    private boolean areHalatInterior;

    public InternareBuilder() {
        arePatRabatabil = false;
        areMicDejunInclus = false;
        arePapuciCamera = false;
        areHalatInterior = false;
    }

    public InternareBuilder setNumePacient(String numePacient) {
        this.numePacient = numePacient;
        return this;
    }

    public InternareBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public InternareBuilder setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
        return this;
    }

    public InternareBuilder setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
        return this;
    }

    public InternareBuilder setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
        return this;
    }

    @Override
    public Internare build(String numePacient) {
        return (new Internare(numePacient, arePatRabatabil, areMicDejunInclus, arePapuciCamera, areHalatInterior));
    }
}
