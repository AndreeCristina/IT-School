package session_10_OOP.challenge.challenge_1;

public class Address {

    private String street;
    private String number;
    private String block;
    private int flatNo;
    private String city;
    private String county;
    private String postalCode;

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