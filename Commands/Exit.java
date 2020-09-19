package Commands;

import This.OrganizationData;

public class Exit implements Command {
    public Exit() {
        CommandExecutor.addCommand("exit", this);
    }



    public void execute(String arg, OrganizationData data) {
        System.exit(0);
    }

}
