package Commands;

import This.Organization;
import This.OrganizationData;

public class Clear implements Command{
    public Clear() {
        CommandExecutor.addCommand("clear",this);
    }
    public void execute(String s, OrganizationData org){
        org.clearCollection();
        System.out.println("Collection Cleared");
    }
}
