package Commands;

import This.OrganizationData;

public class FilterStartsWithName implements Command {
    public FilterStartsWithName() {
        CommandExecutor.addCommand("filter_starts_with_name", this);
    }

    @Override
    public void execute(String arg, OrganizationData data) {
        if (arg != null) {
            data.getQ().stream()
                    .filter(o -> o.getName().startsWith(arg))
                    .forEach(o -> System.out.println(o.getName()));
        } else {
            System.out.println("Wrong input format");
        }
    }
}
