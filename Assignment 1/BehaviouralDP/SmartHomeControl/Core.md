Core Thinking for Smart Home Control Application

1. **Command Pattern**: Implements the Command Pattern to encapsulate smart home operations (mood lighting, aroma diffusion, robotic plant).

2. **Separation of Concerns**: Distinct classes for receivers (MoodLighting, AromaticDiffuser, RoboticPlant) handle specific functionalities.

3. **Command Implementations**: Separate command classes (PartyModeCommand, RelaxModeCommand) define actions and their reversibility.

4. **Invoker**: SmartHomeController manages command execution and history, allowing for easy undo operations.

This design promotes extensibility and maintainability while effectively managing complex smart home operations.
