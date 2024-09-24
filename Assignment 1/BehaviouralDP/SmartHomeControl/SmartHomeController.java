package BehaviouralDP.SmartHomeControl;

import java.util.ArrayList;
import java.util.List;

class SmartHomeController {
    private List<Command> commandHistory = new ArrayList<>(); // History of executed commands

    public void executeCommand(Command command) {
        command.execute(); // Execute the command
        commandHistory.add(command); // Store in history
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo(); // Undo the last executed command
        }
    }
}