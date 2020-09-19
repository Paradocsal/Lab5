package Commands;

import This.NewElementData;
import This.Organization;
import This.OrganizationData;

public class AddNew implements Command {
    public AddNew(){
        CommandExecutor.addCommand("add",this);
    }
    public void execute(String s, OrganizationData orgData){
        Organization organization = NewElementData.createOrganization();
        orgData.addOrganization(organization);
        System.out.println(organization.getName() + " was added");

    }
}
