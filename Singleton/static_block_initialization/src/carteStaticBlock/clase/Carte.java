package carteStaticBlock.clase;

public class Carte {
    private String titlu;
    private int nrPagini;
    private String autor;
    private static Carte instance;

    static {
        try {
            instance = new Carte("A little life", 832, "Hanya Yanigahara");
        } catch(Exception exception){
            System.out.println("Instanta nu poate fi creata");
        }
    }

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

    public static Carte getInstance(){
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
