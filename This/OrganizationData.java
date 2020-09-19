package This;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
@XmlType(name = "organizationdata")
@XmlRootElement
/**
 * Wrapper for collection of organizations
 */
public class OrganizationData {


    private LocalDateTime startTime;
    private ArrayDeque<Organization> q;
    /**
     * Building empty OrganizationData
     */
    public OrganizationData(){
        q = new ArrayDeque<>();
        startTime = LocalDateTime.now();
    }
    public void setStartTime(LocalDateTime startTime){
        this.startTime = startTime;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
    public void setQ(ArrayDeque<Organization> q){
        this.q = q;
    }
    public ArrayDeque<Organization> getQ() {
        return q;
    }
    public Organization getFirst(){return q.getFirst();}
    public void removeFirst(){ q.removeFirst();}
    public long getLastId(){
        long lastId = 0;
        for(Organization org : q){
            if(org.getId() > lastId){
                lastId = org.getId();
            }
        }
        return lastId;
    }
    public void addOrganization(Organization org){
        org.setId(getLastId()+1);
        this.q.add(org);
    }

    public ArrayList<Long> getListOfIds() {
        ArrayList<Long> ids = new ArrayList<>();
        for (Organization organization :
                q) {
            ids.add(organization.getId());
        }
        return ids;
    }
    public Organization getElementById(long id){
        for(Organization org : q){
            if(org.getId() == id){
                return org;
            }
        }
        return null;
    }
    public void updateOrganization(long id, Organization organization) {
        Organization updatingOrganization = new Organization();
        for (Organization org :
                q) {
            if (org.getId() == id) {
                updatingOrganization = org;
            }
        }
        q.remove(updatingOrganization);
        organization.setId(id);
        q.add(organization);
    }
    public void remove(Organization org){
        q.remove(org);
    }
    public void clearCollection(){
        q.clear();
    }
}
