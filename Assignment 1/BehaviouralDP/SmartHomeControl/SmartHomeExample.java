package BehaviouralDP.SmartHomeControl;

class SmartHomeExample {
    public static void main(String[] args) {
        // Creating receivers
        MoodLighting moodLighting = new MoodLighting();
        AromaticDiffuser aromaticDiffuser = new AromaticDiffuser();
        RoboticPlant roboticPlant = new RoboticPlant();

        // Defining commands
        Command partyMode = new PartyModeCommand(moodLighting, aromaticDiffuser, roboticPlant);
        Command relaxMode = new RelaxModeCommand(moodLighting, aromaticDiffuser);

        // Controller for managing commands
        SmartHomeController controller = new SmartHomeController();

        controller.executeCommand(partyMode); // Activate party mode
        controller.executeCommand(relaxMode); // Activate relax mode
        controller.undoLastCommand(); // Undo last command (relax mode)
    }
}