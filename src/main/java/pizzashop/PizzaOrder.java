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

public class PizzaOrder {

    // Unique order ID
    private String orderId;

    // The customer who ordered
    private Customer customer;

    // The list of pizzas ordered
    private List<OrderItem> orderItems;

    // Payment info
    private Payment payment;

    // Delivery info
    private Delivery delivery;

    public PizzaOrder(String orderId, Customer customer, List<OrderItem> orderItems,
                      Payment payment, Delivery delivery) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderItems = orderItems;
        this.payment = payment;
        this.delivery = delivery;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public List<OrderItem> getOrderItems() { return orderItems; }
    public void setOrderItems(List<OrderItem> orderItems) { this.orderItems = orderItems; }

    public Payment getPayment() { return payment; }
    public void setPayment(Payment payment) { this.payment = payment; }

    public Delivery getDelivery() { return delivery; }
    public void setDelivery(Delivery delivery) { this.delivery = delivery; }

    @Override
    public String toString() {
        return " PIZZA ORDER " +
                " Order ID : " + orderId +
                " Customer  : " + customer +
                " Items     : " + orderItems +
                " Payment   : " + payment +
                " Delivery  : " + delivery +
                " ";
    }
}