package Commands;

import This.OrganizationData;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private static Map<String, Command> commandMap = new HashMap<>();
    private static Map<String, Command> getCommandMap(){
        return commandMap;
    }
    public static void addCommand(String name, Command command){
        commandMap.put(name, command);
    }
    public static void execute(String action, OrganizationData orgData) {
        String[] actionParts = action.split(" ");
        if (action.isEmpty()) {
            return;
        }
        if (actionParts.length == 1) {
            Command command = commandMap.get(actionParts[0]);
            if (command != null) {
                command.execute(null, orgData);
            } else {
                System.out.println("commands.Command doesn't exist.");
            }
        } else if (actionParts.length == 2) {
            Command command = commandMap.get(actionParts[0]);
            String arg = actionParts[1];
            if (command != null) {
                command.execute(arg, orgData);
            } else {
                System.out.println("commandMap.Command doesn't exist.");
            }
        } else {
            System.out.println("Wrong command input.");
        }
    }
    //!
}
