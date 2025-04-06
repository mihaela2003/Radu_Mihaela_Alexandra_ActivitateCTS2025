package carteSerialization.clase;

import java.io.ObjectInput;
import java.io.Serializable;

public class Carte implements Serializable {
    private String titlu;
    private int nrPagini;
    private String autor;
    private static Carte instance = null;

    public static Carte getInstance(String titlu, int nrPagini, String autor){
        if (instance == null){
            instance = new Carte(titlu, nrPagini, autor);
        }
        return instance;
    }

    protected Object readResolve(){
        return getInstance("nu conteaza", 0, "nu conteaza");
    }

    public Carte(String titlu, int nrPagini, String autor) {
        this.titlu = titlu;
        this.nrPagini = nrPagini;
        this.autor = autor;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
