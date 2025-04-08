package spitalBuilderV2.clase;

public class Internare {
    private String numePacient;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciCamera;
    private boolean areHalatInterior;

    protected Internare(String numePacient, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciCamera, boolean areHalatInterior) {
        this.numePacient = numePacient;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciCamera = arePapuciCamera;
        this.areHalatInterior = areHalatInterior;
    }

    protected void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    protected void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    protected void setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuciCamera=").append(arePapuciCamera);
        sb.append(", areHalatInterior=").append(areHalatInterior);
        sb.append('}');
        return sb.toString();
    }
}
