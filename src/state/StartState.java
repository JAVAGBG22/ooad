package state;

public class StartState implements State {
    @Override
    public void doAction(ContextClass context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
