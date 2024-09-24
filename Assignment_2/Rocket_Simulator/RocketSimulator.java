package Assignment_2.Rocket_Simulator;

import java.util.Scanner;

public class RocketSimulator {
    private State state;
    private ConsoleLogger logger;
    private int fuel = 100;
    private int altitude = 0;
    private int speed = 0;
    private int stage = 1;

    public RocketSimulator() {
        this.state = new PreLaunchState(this);
        this.logger = new ConsoleLogger();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                if (input.startsWith("fast_forward")) {
                    int seconds = Integer.parseInt(input.split(" ")[1]);
                    state.fastForward(seconds);
                } else {
                    switch (input) {
                        case "start_checks":
                            state.startChecks();
                            break;
                        case "launch":
                            state.launch();
                            break;
                        default:
                            logger.log("Invalid command");
                    }
                }
            } catch (SimulatorException e) {
                logger.log(e.getMessage());
            } catch (Exception e) {
                logger.log("An unexpected error occurred.");
            }
        }
    }

    public void updateState(State newState) {
        this.state = newState;
    }

    public void updateParameters(int fuel, int altitude, int speed, int stage) {
        this.fuel = fuel;
        this.altitude = altitude;
        this.speed = speed;
        this.stage = stage;
    }

    public int getFuel() { return fuel; }
    public int getAltitude() { return altitude; }
    public int getSpeed() { return speed; }
    public int getStage() { return stage; }

    public ConsoleLogger getLogger() { return logger; }
}