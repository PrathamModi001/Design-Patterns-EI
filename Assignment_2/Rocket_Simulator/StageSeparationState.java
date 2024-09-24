package Assignment_2.Rocket_Simulator;

public class StageSeparationState extends State {
    public StageSeparationState(RocketSimulator simulator) {
        super(simulator);
    }

    @Override
    public void launch() {
        while (simulator.getFuel() > 0) {
            simulator.updateParameters(
                simulator.getFuel() - 1,
                simulator.getAltitude() + 10,
                simulator.getSpeed() + 1000,
                simulator.getStage() + 1
            );
            simulator.getLogger().log(
                String.format("Stage: %d, Fuel: %d%%, Altitude: %d km, Speed: %d km/h",
                simulator.getStage(), simulator.getFuel(), simulator.getAltitude(), simulator.getSpeed())
            );

            if (simulator.getAltitude() >= 100) {
                simulator.updateState(new OrbitPlacementState(simulator));
                simulator.getLogger().log("Orbit achieved! Mission Successful.");
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