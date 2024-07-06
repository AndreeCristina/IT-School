package session_10_OOP.challenge.Challenge1;

public class Address {

    String street;
    String number;
    String block;
    int flatNo;
    String city;
    String county;
    String postalCode;

    public Address(String street, String number, String block, int flatNo, String city, String county, String postalCode) {

        this.street = street;
        this.number = number;
        this.block = block;
        this.flatNo = flatNo;
        this.city = city;
        this.county = county;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", block='" + block + '\'' +
                ", flatNo=" + flatNo +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
