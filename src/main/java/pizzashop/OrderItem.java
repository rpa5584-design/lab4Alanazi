/** Project: Lab 4 - Pizza Shop Web Service
 * Purpose Details: Represents a delivery address with street, city, state, and zip fields.
 * Course: IST 242
 * Author: Rayan
 * Date Developed:  6/13/2026
 * Last Date Changed: 6/13/2026
 * Rev: 1.0
 */
package pizzashop;

import java.util.List;

public class OrderItem {

    // The type of item  pizza
    private String itemType;

    // The size of the pizza
    private String size;

    // The crust type
    private String crust;

    // The list of toppings
    private List<String> toppings;

    // How many of this item
    private int quantity;

    public OrderItem(String itemType, String size, String crust, List<String> toppings, int quantity) {
        this.itemType = itemType;
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
        this.quantity = quantity;
    }

    public String getItemType() { return itemType; }
    public void setItemType(String itemType) { this.itemType = itemType; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public String getCrust() { return crust; }
    public void setCrust(String crust) { this.crust = crust; }

    public List<String> getToppings() { return toppings; }
    public void setToppings(List<String> toppings) { this.toppings = toppings; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return size + " " + crust + " pizza with " + toppings + " x" + quantity;
    }
}