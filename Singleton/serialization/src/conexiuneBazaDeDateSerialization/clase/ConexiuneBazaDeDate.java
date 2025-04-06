package conexiuneBazaDeDateSerialization.clase;

import java.io.Serializable;

public class ConexiuneBazaDeDate implements Serializable {
    private String numeBaza;
    private int nrTabele;
    private String linkConexiune;
    private static ConexiuneBazaDeDate instance = null;

    public static ConexiuneBazaDeDate getInstance(String numeBaza, int nrTabele, String linkConexiune){
        if (instance == null) {
            instance = new ConexiuneBazaDeDate(numeBaza, nrTabele, linkConexiune);
        }
        return instance;
    }

    protected Object readResolve(){
        return getInstance("nu conteaza", 0, "nu conteaza");
    }

    public ConexiuneBazaDeDate(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    public String getNumeBaza() {
        return numeBaza;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public int getNrTabele() {
        return nrTabele;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public String getLinkConexiune() {
        return linkConexiune;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }


}
