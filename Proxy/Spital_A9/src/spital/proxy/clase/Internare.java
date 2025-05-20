package spital.proxy.clase;

public class Internare implements IInternare{
    @Override
    public void internare(String numePacient, boolean areCardDeSanatate) {
        StringBuilder sb = new StringBuilder();
        sb.append("pacientul ").append(numePacient);
        if (areCardDeSanatate){
            sb.append(" are card de sanatate");
        } else {
            sb.append(" nu are card de sanatate");
        }

        System.out.println(sb.toString());
    }
}
