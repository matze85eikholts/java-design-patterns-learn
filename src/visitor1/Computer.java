package visitor1;

public class Computer implements ComputerPart {
    ComputerPart[] parts;
    public Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard("XXX-007"), new Monitor()};
    }
    public void accept(ComputerPartVisitor compVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(compVisitor);
        }
        compVisitor.visit(this);
    }
}
