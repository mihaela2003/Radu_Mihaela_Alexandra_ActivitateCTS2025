package agentieFlyweight.clase;

public class PachetTuristic implements IPachetTuristic{
    private int codPachet;
    private String hotel;
    private String destinatie;
    private boolean micDejun;

    public PachetTuristic(int codPachet, String hotel, String destinatie, boolean micDejun) {
        super();
        this.codPachet = codPachet;
        this.hotel = hotel;
        this.destinatie = destinatie;
        this.micDejun = micDejun;
    }

    public int getCodPachet() {
        return codPachet;
    }

    public void setCodPachet(int codPachet) {
        this.codPachet = codPachet;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTuristic{");
        sb.append("codPachet=").append(codPachet);
        sb.append(", hotel='").append(hotel).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", micDejun=").append(micDejun);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriePachet(Optionale optionale) {
        StringBuilder sb = new StringBuilder("Pachetul turistic are codul " + codPachet);
        sb.append(", are cazare la hotelul " + hotel);
        sb.append(", din orasul " + destinatie);
        if(micDejun){
            sb.append(", are micDejun");
        }
        else {
            sb.append(",nu are micDejun");
        }
        if(optionale.isCina()){
            sb.append(", are inclusa cina ");
        } else {
            sb.append(", nu are cina inclusa ");
        }
        sb.append("si are un numar de " + optionale.getNumarExcursii() + " excursii optionale");

        System.out.println(sb.toString());
    }
}
