package Assignment_2.Rocket_Simulator;

public class PreLaunchState extends State {
    public PreLaunchState(RocketSimulator simulator) {
        super(simulator);
    }

    @Override
    public void startChecks() {
        simulator.getLogger().log("All systems are 'Go' for launch.");
        simulator.updateState(new LaunchState(simulator));
    }
}
