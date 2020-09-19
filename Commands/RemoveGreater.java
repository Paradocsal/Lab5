package Commands;

import This.NewElementData;
import This.Organization;
import This.OrganizationData;

import java.util.NoSuchElementException;

public class RemoveGreater implements Command{
    public RemoveGreater() {
        CommandExecutor.addCommand("remove_greater", this);
    }
    public void execute(String arg, OrganizationData data) {
        long oldSize = data.getListOfIds().size();

        System.out.println("Enter element data");
        Organization organization = NewElementData.createOrganization();
        try {
            data.remove(data.getQ().stream()
                    .filter(o -> organization.compareTo(o) < 0)
                    .findFirst()
                    .get());
            //data.removeIfGreater(organization);

            long newSize = data.getListOfIds().size();
            System.out.println((oldSize - newSize) + " elements greater than " + organization + "\nwere removed");
        }
        catch (NoSuchElementException e){
            System.out.println( "0 elements greater than " + organization + "\nwere removed");
        }
    }
}
