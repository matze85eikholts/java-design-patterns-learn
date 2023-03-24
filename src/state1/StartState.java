package state1;

public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("System in the start state");
        context.setState(this);
    }
    public String toString() {
        return "Start state";
    }
}
