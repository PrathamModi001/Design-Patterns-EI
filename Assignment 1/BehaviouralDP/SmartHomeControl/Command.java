package BehaviouralDP.SmartHomeControl;

// Command interface defining the execute and undo methods
interface Command {
    void execute(); // Execute the command
    void undo();    // Undo the command
}