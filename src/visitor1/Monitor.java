package visitor1;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor compVisitor) {
        compVisitor.visit(this);
    }
}
