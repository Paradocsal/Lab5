package Commands;

import This.OrganizationData;

public class AverageOfEmployeesCount implements Command{
    public AverageOfEmployeesCount() {
        CommandExecutor.addCommand("Average_of_employees_count", this);
    }

    @Override
    public void execute(String arg, OrganizationData data) {
        System.out.println("Average of employees count in the organization: " + data.getQ().stream()
                .mapToInt(o -> o.getEmployeesCount()).average());
    }
}
