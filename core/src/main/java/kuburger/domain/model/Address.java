package kuburger.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter @Setter
public class Address implements Serializable, Comparable<Address> {

    private static final long serialVersionUID = 1L;

    private String streetName;
    private Short number;
    private String zipCode;
    private String district;
    private String city;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return number == address.number &&
                Objects.equals(streetName, address.streetName) &&
                Objects.equals(zipCode, address.zipCode) &&
                Objects.equals(district, address.district) &&
                Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, number, zipCode, district, city);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", number=" + number +
                ", zipCode='" + zipCode + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(Address address) {
        if (address.number > this.number) return -1;

        if (address.number.equals(this.number)) return 0;

        return 1;
    }
}
