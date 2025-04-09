package cinematograf.clase;

public class BiletFilm extends AbstractTicket implements Ticket{
    private String data;
    private int ora;
    private String loc;

    public BiletFilm(String titlu, String descriere, boolean areReclame, String data, int ora, String loc) {
        super(titlu, descriere, areReclame);
        this.data = data;
        this.ora = ora;
        this.loc = loc;
    }

    public BiletFilm() {
        super();
    }


    @Override
    public AbstractTicket copiaza(String titlu) {
        BiletFilm ticket = new BiletFilm();
        ticket.titlu = this.titlu;
        ticket.descriere = this.descriere;
        ticket.areReclame = this.areReclame;
        ticket.data = this.data;
        ticket.loc = this.loc;
        ticket.ora = this.ora;
        return ticket;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BiletFilm{");
        sb.append("data='").append(data).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", loc='").append(loc).append('\'');
        sb.append(", titlu='").append(titlu).append('\'');
        sb.append(", descriere='").append(descriere).append('\'');
        sb.append(", areReclame=").append(areReclame);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere() {
        System.out.println("Biletul la filmul " + super.toString() + " esta la data de " + this.data +
                " la ora " + this.ora + " si are locul trecut " + this.loc);
    }
}
