package Assignment_2.Rocket_Simulator;

public class LaunchState extends State {
    private int timeElapsed = 0;

    public LaunchState(RocketSimulator simulator) {
        super(simulator);
    }

    @Override
    public void launch() {
        while (simulator.getFuel() > 0) {
            timeElapsed++;
            simulator.updateParameters(
                simulator.getFuel() - 1,
                simulator.getAltitude() + 10,
                simulator.getSpeed() + 1000,
                simulator.getStage()
            );
            simulator.getLogger().log(
                String.format("Stage: %d, Fuel: %d%%, Altitude: %d km, Speed: %d km/h",
                simulator.getStage(), simulator.getFuel(), simulator.getAltitude(), simulator.getSpeed())
            );

            if (timeElapsed == 10) {
                simulator.getLogger().log("Stage 1 complete. Separating stage. Entering Stage 2.");
                simulator.updateState(new StageSeparationState(simulator));
                return;
            }
        }
        simulator.updateState(new MissionFailureState(simulator));
        simulator.getLogger().log("Mission Failed due to insufficient fuel.");
    }

    @Override
    public void fastForward(int seconds) {
        for (int i = 0; i < seconds; i++) {
            launch();
        }
    }
}