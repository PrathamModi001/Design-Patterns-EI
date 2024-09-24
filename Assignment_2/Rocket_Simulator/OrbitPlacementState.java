package Assignment_2.Rocket_Simulator;

public class OrbitPlacementState extends State {
    public OrbitPlacementState(RocketSimulator simulator) {
        super(simulator);
    }

    @Override
    public void launch() {
        simulator.getLogger().log("Orbit achieved! Mission Successful.");
    }

    @Override
    public void fastForward(int seconds) {
        simulator.getLogger().log("Orbit achieved! Mission Successful.");
    }
}