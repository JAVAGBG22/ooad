package state;

public class ContextClass {
    private State state;

    public ContextClass() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
