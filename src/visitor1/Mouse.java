package visitor1;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor compVisitor) {
        compVisitor.visit(this);
    }
}
