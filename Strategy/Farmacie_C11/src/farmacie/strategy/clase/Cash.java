package farmacie.strategy.clase;

public class Cash implements ModPlata{
    @Override
    public void modPlata(String nume, float sumaDePlata) {
        System.out.println(nume + " plateste o reteta in valoare de " + sumaDePlata + " lei cash");
    }
}
