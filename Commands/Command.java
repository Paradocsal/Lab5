package Commands;

import This.Organization;
import This.OrganizationData;

public interface Command {
    void execute(String s, OrganizationData data);
}
