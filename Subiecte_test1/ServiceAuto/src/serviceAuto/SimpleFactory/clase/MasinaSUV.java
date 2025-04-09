package serviceAuto.SimpleFactory.clase;

import serviceAuto.Singleton.AMasina;

public class MasinaSUV extends AMasina {
    public MasinaSUV(String marca, String model, String nrInmatriculare, int anFabricatie) {
        super(marca, model, nrInmatriculare, anFabricatie);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
