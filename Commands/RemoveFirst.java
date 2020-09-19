package Commands;

import This.OrganizationData;

import java.util.NoSuchElementException;

public class RemoveFirst implements Command{
    public  RemoveFirst(){
        CommandExecutor.addCommand("remove_first_element",this);
    }
    public void execute(String arg, OrganizationData data) {
            try{
                data.removeFirst();
                System.out.println("First organization was removed");
            }
            catch (NoSuchElementException e){
                System.out.println("Collection is empty.");
            }
    }
}
