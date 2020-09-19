package Commands;

import This.NewElementData;
import This.Organization;
import This.OrganizationData;

public class UpdateId implements Command {
    public UpdateId(){
        CommandExecutor.addCommand("update_id", this);
    }

    @Override
    public void execute(String s, OrganizationData data) {
        try{
            long id = Long.parseLong(s);
            Organization organization = NewElementData.createOrganization();

            if (data.getListOfIds().contains(id)) {
                data.updateOrganization(id, organization);
                Organization newOrganization = data.getElementById(id);
                System.out.println("Element with id " + id + " was updated, new one:\n" + newOrganization);
            } else {
                System.out.println("Band with id " + id + " doesn't exist");
            }

        } catch (NumberFormatException e) {
            System.out.println("Wrong id number format");
        }

        }
    }

