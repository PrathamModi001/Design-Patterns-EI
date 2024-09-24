package BehaviouralDP.SmartHomeControl;

class RelaxModeCommand implements Command {
    private MoodLighting moodLighting;
    private AromaticDiffuser aromaticDiffuser;

    public RelaxModeCommand(MoodLighting moodLighting, AromaticDiffuser aromaticDiffuser) {
        this.moodLighting = moodLighting;
        this.aromaticDiffuser = aromaticDiffuser;
    }

    public void execute() {
        moodLighting.activateRelaxMode();
        aromaticDiffuser.startLavender();
    }

    public void undo() {
        moodLighting.activatePartyMode();
        aromaticDiffuser.stop();
    }
}