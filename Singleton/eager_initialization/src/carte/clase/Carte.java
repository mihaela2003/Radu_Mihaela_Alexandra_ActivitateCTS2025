package carte.clase;

public class Carte {
    private String titlu;
    private int nrPagini;
    private String autor;
    private static Carte instance = new Carte("A little life", 733, "Hanya Yanagihara");

    public Carte(String titlu, int nrPagini, String autor) {
        this.titlu = titlu;
        this.nrPagini = nrPagini;
        this.autor = autor;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public static Carte getInstance(){
        return instance;
    }
}
