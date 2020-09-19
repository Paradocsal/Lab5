package Commands;

import This.Organization;
import This.OrganizationData;



public class PrintAscending implements Command {
    public PrintAscending() { CommandExecutor.addCommand("Print ascending", this); }
    public void execute(String arg, OrganizationData data) {
        //Organization org = data.getQ().stream().sorted();
        for (Organization org : data.getQ()){
            //org = data.getQ().stream().filter(o -> o.compareTo(o)>0)
        }
    }
}
