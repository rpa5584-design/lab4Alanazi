/** Project: Lab 4 - Pizza Shop Web Service
 * Purpose Details: Represents a delivery address with street, city, state, and zip fields.
 * Course: IST 242
 * Author: Rayan
 * Date Developed:  6/13/2026
 * Last Date Changed: 6/13/2026
 * Rev: 1.0
 */
package pizzashop;

import com.google.gson.Gson;
import static spark.Spark.*;

public class WebServiceReceive {

    public static void main(String[] args) {

        Gson gson = new Gson();

        port(4567);

        System.out.println("Server is running on port 4567... waiting for orders!");

        post("pizza", (request, response) -> {

            String json = request.body();

            System.out.println("JSON received: " + json);

            PizzaOrder order = gson.fromJson(json, PizzaOrder.class);

            System.out.println("Order details: " + order);

            response.status(200);
            return "Got your order!";
        });
    }
}