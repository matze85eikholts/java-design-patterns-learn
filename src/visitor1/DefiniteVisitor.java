package visitor1;

public class DefiniteVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Inspect computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Inspect mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Inspect keyboard");
        System.out.println(keyboard.getName());
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Inspect monitor");
    }
}
