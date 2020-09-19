package Commands;

import This.Organization;
import This.OrganizationData;

public class Show implements Command {
    public Show(){
        CommandExecutor.addCommand("show",this  );
    }
    @Override
    public void execute(String s, OrganizationData data){
        System.out.println("Queue elements: ");
        for (Organization org : data.getQ()){
            System.out.println(org.getName());
        }
    }
}
