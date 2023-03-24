package state1;

public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("System in stop state");
        context.setState(this);
    }
    public String toString() {
        return "Stop state";
    }
}
