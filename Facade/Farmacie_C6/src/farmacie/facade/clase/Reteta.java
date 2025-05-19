package farmacie.facade.clase;

import java.util.List;

public class Reteta {
    private boolean esteInSistem;

    public Reteta(boolean esteInSistem) {
        this.esteInSistem = esteInSistem;
    }

    public boolean isEsteInSistem() {
        return esteInSistem;
    }
}
