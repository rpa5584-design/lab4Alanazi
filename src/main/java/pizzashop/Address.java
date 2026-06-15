/** Project: Lab 4 - Pizza Shop Web Service
 * Purpose Details: Represents a delivery address with street, city, state, and zip fields.
 * Course: IST 242
 * Author: Rayan
 * Date Developed:  6/13/2026
 * Last Date Changed: 6/13/2026
 * Rev: 1.0
 */
package pizzashop;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}