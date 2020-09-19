package Commands;

import This.OrganizationData;

import java.io.IOException;

public class RemoveById implements Command {
    public  RemoveById(){
        CommandExecutor.addCommand("remove_id",this);
    }
    @Override
    public void execute(String arg, OrganizationData data) {
        try {
            Long id = Long.parseLong(arg);
            if (data.getListOfIds().contains(id)) {
                data.remove( data.getQ().stream().filter(o ->o.getId()==id).findFirst().get());

                System.out.println("Organizartion with id " + id + " was removed");
            } else {
                System.out.println("Organization with id " + id + " not found");
            }


        } catch (NumberFormatException e) {
            System.out.println("Id's number format error");
        }
    }
}
