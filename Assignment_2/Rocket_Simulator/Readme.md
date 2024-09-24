# Rocket Launch Simulator

## Key Decision Maker

This Rocket Launch Simulator has been designed with the following considerations:

1. **Code Organization**: Each class is in a separate file to ensure modularity and maintainability.
2. **State Design Pattern**: Used to manage different states of the rocket launch process (Pre-Launch, Launch, Stage Separation, Orbit Placement, Mission Failure).
3. **Logging**: Implemented a `ConsoleLogger` class for consistent logging across the application.
4. **Exception Handling**: Custom `SimulatorException` class to handle specific errors gracefully.
5. **Defensive Programming**: Validations and error handling are in place to prevent invalid operations.
6. **Performance**: Code is optimized to handle user inputs efficiently over long durations.

## Project Structure

- **Main.java**: Entry point of the application.
- **RocketSimulator.java**: Manages the overall simulation, user inputs, and state transitions.
- **State.java**: Abstract class representing the state of the rocket.
- **PreLaunchState.java**: Handles the pre-launch checks.
- **LaunchState.java**: Manages the launch process.
- **StageSeparationState.java**: Handles stage separation and subsequent flight.
- **OrbitPlacementState.java**: Final state when the rocket reaches orbit.
- **MissionFailureState.java**: Handles mission failure due to insufficient fuel.
- **ConsoleLogger.java**: Provides logging functionality.
- **SimulatorException.java**: Custom exception class for simulation-specific errors.

This structured approach ensures the Rocket Launch Simulator is both functional and maintainable.
