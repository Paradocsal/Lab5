package This;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.time.ZonedDateTime;
/**
 * Organization main class
 */
@XmlType(name = "Organization")
@XmlRootElement
public class Organization {
        private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
        private String name; //Поле не может быть null, Строка не может быть пустой
        private Coordinates coordinates; //Поле не может быть null
        private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
        private double annualTurnover; //Значение поля должно быть больше 0
        private String fullName; //Поле не может быть null
        private Integer employeesCount; //Поле не может быть null, Значение поля должно быть больше 0
        private OrganizationType type; //Поле не может быть null
        private Address postalAddress; //Поле может быть null
        public void setId(long id){
            this.id = id;
        }
        public long getId(){ return id; }
        public void setFullName(String s){
            this.fullName = s;
        }
        public void setName(String name){ this.name = name;}
        public String getName(){ return name;}
        public void setCoordinates(Coordinates coordinates) {
            this.coordinates = coordinates;
        }
        public void setType(OrganizationType type) {this.type = type;}
        public void setPostalAddress(Address postalAddress){this.postalAddress = postalAddress;}
        public Address getPostalAddress() { return postalAddress; }
    public void setEmployeesCount(Integer employeesCount) {
            this.employeesCount = employeesCount;
        }
        public Integer getEmployeesCount(){return employeesCount;}
        public void setAnnualTurnover(double annualTurnover) {
            this.annualTurnover = annualTurnover;
        }
         public int compareTo(Organization org) {
            return this.getName().compareTo(org.getName());
            }
        public void setCreationDate(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }

}


