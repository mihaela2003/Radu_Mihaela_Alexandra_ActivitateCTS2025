package farmacie.proxy.clase;

public class Reteta implements IReteta{
    @Override
    public void achizitionareMedicamente(int numarMedicamente, boolean areReteta) {
        System.out.println(numarMedicamente + " " + areReteta);
    }
}
