/** Project: Lab 4 - Pizza Shop Web Service
 * Purpose Details: Sends a pizza order as JSON to the web service server
 * Course: IST 242
 * Author: Rayan
 * Date Developed: 6/14/2026
 * Last Date Changed: 6/14/2026
 * Rev: 1.0
 */
package pizzashop;

import com.google.gson.Gson;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class WebServiceSend {

    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();

        // Build the order
        Address address = new Address("123 Pizza St", "Pizzaville", "PA", "10000");
        Customer customer = new Customer("Rayan Alanazi", "814-769-9301", address);

        OrderItem item1 = new OrderItem("pizza", "large", "thin",
                Arrays.asList("beef", "mushrooms", "extra cheese"), 1);

        Payment payment = new Payment("credit_card", "4242", 39.98);
        Delivery delivery = new Delivery("home_delivery", "2025-06-09T18:30:00");

        PizzaOrder order = new PizzaOrder("12345", customer,
                Arrays.asList(item1), payment, delivery);

        // Print order details before sending
        System.out.println("       NEW PIZZA ORDER       ");
        System.out.println("Customer : " + customer.getName());
        System.out.println("Phone    : " + customer.getPhone());
        System.out.println("Address  : " + address);
        System.out.println("Pizza    : " + item1.getSize() + " / " + item1.getCrust());
        System.out.println("Toppings : " + item1.getToppings());
        System.out.println("Payment  : " + payment.getMethod() + " ending in " + payment.getCardLast4());
        System.out.println("Total    : $" + payment.getTotalAmount());
        System.out.println("Delivery : " + delivery.getDeliveryType());
        System.out.println("Sending order to server...");
        System.out.println();

        // Convert to JSON
        String json = gson.toJson(order);

        // Send it to the server
        URL url = new URL("http://localhost:4567/pizza");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        OutputStream out = conn.getOutputStream();
        out.write(json.getBytes(StandardCharsets.UTF_8));

        int code = conn.getResponseCode();
        if (code == 200) {
            System.out.println("Order sent successfully!");
            System.out.println("Server responded with code: " + code);
        } else {
            System.out.println("Something went wrong. Code: " + code);
        }

        conn.disconnect();
    }
}