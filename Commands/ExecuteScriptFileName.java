package Commands;

import This.Inputting;
import This.OrganizationData;

import java.io.IOException;

public class ExecuteScriptFileName implements Command {
    public ExecuteScriptFileName() {
        CommandExecutor.addCommand("execute_script", this);
    }

    @Override
    public void execute(String s, OrganizationData data) {
        if (s != null) {
            try {
                if (Inputting.runningScriptNames.contains(s)) {
                    System.out.println("This script has been already called. Avoid endless recursion.");

                }
                Inputting.parseScript(s);
                System.out.println("Reading commands from file " + s);
            } catch (IOException e) {
                System.out.println("Error while reading script file " + s);
            }
        } else {
            System.out.println("Wrong command format.");
        }
    }
}
