package feb9;

public class Address {
    int houseNumber;
    String city;
    String country;
    String postalCode;

    public Address(int houseNumber, String city, String country, String postalCode) {
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
    }
}
