package facade1;

public class Facade {
    private HairCutter _hairCut;
    private HairWasher _hairWash;
    private HairStyler _hairStyle;
    public Facade() {
        _hairCut = new HairCutter();
        _hairStyle = new HairStyler();
        _hairWash = new HairWasher();
    }
    public void makeStyledHairCut() {
        _hairCut.cut();
        _hairStyle.style();
        _hairWash.wash();
    }
}
