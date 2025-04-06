package carteThreadSafe.clase;

public class Carte {
    private String titlu;
    private int nrPagini;
    private String autor;
    private static Carte instance = null;

    public Carte(String titlu, int nrPagini, String autor) {
        this.titlu = titlu;
        this.nrPagini = nrPagini;
        this.autor = autor;
    }

    public static Carte getInstance(String titlu, int nrPagini, String autor){
        if (instance == null) {
            instance = new Carte(titlu, nrPagini, autor);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carte{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", nrPagini=").append(nrPagini);
        sb.append(", autor='").append(autor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
