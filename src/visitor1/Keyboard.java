package visitor1;

public class Keyboard implements ComputerPart{
    public String name;
    public Keyboard(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public void accept(ComputerPartVisitor compVisitor) {
        compVisitor.visit(this);
    }
}
