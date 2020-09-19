package Commands;

import This.Organization;
import This.OrganizationData;

import java.util.NoSuchElementException;

public class Head implements Command{
    public  Head(){
        CommandExecutor.addCommand("head",this);
    }
    public void execute(String arg, OrganizationData data) {
        try {
            Organization sFirst = data.getFirst();
            System.out.println("First element is " + sFirst.getName());
        }
        catch (NoSuchElementException e){
            System.out.println("Collection is empty");
        }
    }
}
