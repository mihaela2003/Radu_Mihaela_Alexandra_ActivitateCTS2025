package conexiuneBazaDeDateThreadSafe.clase;

public class ConexiuneBazaDeDate {
    private String numeBaza;
    private int nrTabele;
    private String linkConexiune;
    private static ConexiuneBazaDeDate instance = null;

    public ConexiuneBazaDeDate(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    public static ConexiuneBazaDeDate getInstance(String numeBaza, int nrTabele, String linkConexiune){
        if (instance == null){
            instance = new ConexiuneBazaDeDate(numeBaza, nrTabele, linkConexiune);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConexiuneBazaDeDate{");
        sb.append("numeBaza='").append(numeBaza).append('\'');
        sb.append(", nrTabele=").append(nrTabele);
        sb.append(", linkConexiune='").append(linkConexiune).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
