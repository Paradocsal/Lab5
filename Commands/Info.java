package Commands;

import This.*;


public class Info implements Command {
    public Info(){
        CommandExecutor.addCommand("info",this);

    }

    @Override
    public void execute(String s, OrganizationData orgData) {
        System.out.println("Тип: ArrayDequeue\n" + "Время инициализации : " + orgData.getStartTime() +
                " Количество элементов: " + orgData.getQ().size() + '\n');
    }
}
