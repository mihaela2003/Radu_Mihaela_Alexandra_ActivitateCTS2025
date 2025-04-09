package serviceAuto.Singleton;

public class Service implements IService{
    private String numeService;
    private String adresa;
    private int nrAngajati;
    private AMasina masina;
    private static Service instance = null;

    public void setMasina(AMasina masina) {
        this.masina = masina;
    }

    private Service(String numeService, String adresa, int nrAngajati, AMasina masina) {
        this.numeService = numeService;
        this.adresa = adresa;
        this.nrAngajati = nrAngajati;
        this.masina = masina;
    }

    public static Service getInstance(String numeService, String adresa, int nrAngajati, AMasina masina){
        if (instance == null) {
            instance = new Service(numeService, adresa, nrAngajati, masina);
        }
        return instance;
    }

    @Override
    public void descriere() {
        System.out.println("Service-ul " + this.numeService + " de la adresa " + this.adresa +
                " are " + this.nrAngajati + " angajati. In momentul de fata masina " +
                masina.toString() + " este in service.");
    }
}
