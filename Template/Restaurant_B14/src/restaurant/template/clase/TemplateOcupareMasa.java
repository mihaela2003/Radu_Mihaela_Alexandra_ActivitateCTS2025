package restaurant.template.clase;

public abstract class TemplateOcupareMasa {
    public void ocupareMasa(Masa masa){
        masaCurata(masa);
        serveteleSchimbate(masa);
        tacamuriAsezate(masa);
        persoaneInvitate(masa);
    }

    abstract void masaCurata(Masa masa);
    abstract void serveteleSchimbate(Masa masa);
    abstract void tacamuriAsezate(Masa masa);
    abstract void persoaneInvitate(Masa masa);
}
