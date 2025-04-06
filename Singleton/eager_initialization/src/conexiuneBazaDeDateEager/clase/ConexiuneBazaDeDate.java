package conexiuneBazaDeDateEager.clase;

public class ConexiuneBazaDeDate {
    private String numeBaza;
    private int nrTabele;
    private String linkConexiune;
    private static ConexiuneBazaDeDate instance = new ConexiuneBazaDeDate("CTS", 2, "fjeifjiwoijwij");

    public ConexiuneBazaDeDate(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }

    public static ConexiuneBazaDeDate getInstance(){
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
