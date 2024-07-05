package session_10_OOP.challenge.Challenge1;

public class Address {

    String type;
    String streetName;
    int number;
    int flatNo;
    String cityName;
    String countyName;
    int postalCode;
    String country;

    public Address(String type, String streetName, int number, int flatNo, String cityName, String countyName,
                   int postalCode, String country) {
        this.type = type;
        this.streetName = streetName;
        this.number = number;
        this.flatNo = flatNo;
        this.cityName = cityName;
        this.countyName = countyName;
        this.postalCode = postalCode;
        this.country = country;

    }

    @Override
    public String toString() {
        return "Address{" +
                "type='" + type + '\'' +
                ", streetName='" + streetName + '\'' +
                ", number=" + number +
                ", flatNo=" + flatNo +
                ", cityName='" + cityName + '\'' +
                ", countyName='" + countyName + '\'' +
                ", postalCode=" + postalCode +
                ", country='" + country + '\'' +
                '}';
    }
}
