/** Project: Lab 4 - Pizza Shop Web Service
 * Purpose Details: Represents a delivery address with street, city, state, and zip fields.
 * Course: IST 242
 * Author: Rayan
 * Date Developed:  6/13/2026
 * Last Date Changed: 6/13/2026
 * Rev: 1.0
 */

/** Project: Lab 4 - Pizza Shop Web Service
 * Purpose Details: Stores customer name, phone, and address
 * Course: IST 242
 * Author: Rayan
 * Date Developed: June 2026
 * Last Date Changed: June 2026
 * Rev: 1.0
 */

package pizzashop;

public class Customer {

    // The customer's name
    private String name;

    // The customer's phone number
    private String phone;

    // The customer's address
    private Address address;

    public Customer(String name, String phone, Address address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    @Override
    public String toString() {
        return name + " | " + phone + " | " + address;
    }
}