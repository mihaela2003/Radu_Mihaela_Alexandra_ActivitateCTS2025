package serviceAuto.prototype;

public class Sticker extends AbstractSticker{
    public Sticker(String culoare, IMasina masina) {
        super(culoare, masina);
    }

    @Override
    public AbstractSticker copiaza(IMasina masina) {
        return new Sticker(this.culoare, masina);
    }
}
