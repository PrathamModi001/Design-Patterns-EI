package Assignment_2.Rocket_Simulator;

public abstract class State {
    protected RocketSimulator simulator;

    public State(RocketSimulator simulator) {
        this.simulator = simulator;
    }

    public void startChecks() throws SimulatorException {
        throw new SimulatorException("Invalid action in current state.");
    }

    public void launch() throws SimulatorException {
        throw new SimulatorException("Invalid action in current state.");
    }

    public void fastForward(int seconds) throws SimulatorException {
        throw new SimulatorException("Invalid action in current state.");
    }
}