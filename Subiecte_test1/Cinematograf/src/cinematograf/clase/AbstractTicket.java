package cinematograf.clase;

public abstract class AbstractTicket {
    protected String titlu;
    protected String descriere;
    protected boolean areReclame;

    public AbstractTicket(String titlu, String descriere, boolean areReclame) {
        if (titlu.length() > 0) {
            this.titlu = titlu;
        }
        else {
            this.titlu = "anonim";
        }
        if(descriere.length() > 0) {
            this.descriere = descriere;
        }
        else {
            this.descriere = "nu exista";
        }
        if(areReclame == true) {
            this.areReclame = areReclame;
        } else {
            this.areReclame = false;
        }
    }

    public AbstractTicket() {
        this.titlu = "anonim";
        this.descriere = "nu exista";
        this.areReclame = false;
    }

    public abstract AbstractTicket copiaza(String titlu);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractTicket{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", descriere='").append(descriere).append('\'');
        sb.append(", areReclame=").append(areReclame);
        sb.append('}');
        return sb.toString();
    }
}
