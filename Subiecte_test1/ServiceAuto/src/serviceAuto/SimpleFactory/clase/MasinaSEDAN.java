package serviceAuto.SimpleFactory.clase;

import serviceAuto.Singleton.AMasina;

public class MasinaSEDAN extends AMasina {
    public MasinaSEDAN(String marca, String model, String nrInmatriculare, int anFabricatie) {
        super(marca, model, nrInmatriculare, anFabricatie);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
