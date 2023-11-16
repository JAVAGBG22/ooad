package state;

public class StatePatternDemo {
    public static void main(String[] args) {
        ContextClass context = new ContextClass();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
