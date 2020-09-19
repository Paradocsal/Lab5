package This;

public class Address {
    private String street; //Поле может быть null

    public Address() {
        this("Unnamed");
    }

    public Address(String name) {
        this.street = name;
    }

    public String getStreet() {
        System.out.println(street);
        return street;
    }




    @Override
    public String toString() {
        return this.street;
    }
}