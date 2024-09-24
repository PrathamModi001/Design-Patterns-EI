package BehaviouralDP.SmartHomeControl;

class PartyModeCommand implements Command {
    private MoodLighting moodLighting;
    private AromaticDiffuser aromaticDiffuser;
    private RoboticPlant roboticPlant;

    public PartyModeCommand(MoodLighting moodLighting, AromaticDiffuser aromaticDiffuser, RoboticPlant roboticPlant) {
        this.moodLighting = moodLighting;
        this.aromaticDiffuser = aromaticDiffuser;
        this.roboticPlant = roboticPlant;
    }

    public void execute() {
        moodLighting.activatePartyMode();
        aromaticDiffuser.startCitrus();
        roboticPlant.dance();
    }

    public void undo() {
        moodLighting.activateRelaxMode();
        aromaticDiffuser.stop();
        roboticPlant.stopDancing();
    }
}
