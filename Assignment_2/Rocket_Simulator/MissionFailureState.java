package Assignment_2.Rocket_Simulator;

public class MissionFailureState extends State {
    public MissionFailureState(RocketSimulator simulator) {
        super(simulator);
    }

    @Override
    public void launch() {
        simulator.getLogger().log("Mission Failed due to insufficient fuel.");
    }

    @Override
    public void fastForward(int seconds) {
        simulator.getLogger().log("Mission Failed due to insufficient fuel.");
    }
}