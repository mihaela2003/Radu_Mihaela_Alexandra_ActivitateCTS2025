package hotelStrategy.clase;

public class VerificareNonUE implements ModVerificare{
    @Override
    public void verificareActe(String nume) {
        System.out.println("Am verificat pasaportul lui " + nume);
    }
}
