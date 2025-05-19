package farmacie.facade.clase;

public class Client {
    private String nume;
    private boolean areCardSanatate;

    public Client(String nume, boolean areCardSanatate) {
        this.nume = nume;
        this.areCardSanatate = areCardSanatate;
    }

    public boolean isAreCardSanatate() {
        return areCardSanatate;
    }
}
