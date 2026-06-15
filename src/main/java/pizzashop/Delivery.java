/** Project: Lab 4 - Pizza Shop Web Service
 * Purpose Details: Represents a delivery address with street, city, state, and zip fields.
 * Course: IST 242
 * Author: Rayan
 * Date Developed:  6/13/2026
 * Last Date Changed: 6/13/2026
 * Rev: 1.0
 */


package pizzashop;

public class Delivery {

    // The delivery type like home delivery or pickup
    private String deliveryType;

    // The scheduled delivery time
    private String scheduledTime;

    public Delivery(String deliveryType, String scheduledTime) {
        this.deliveryType = deliveryType;
        this.scheduledTime = scheduledTime;
    }

    public String getDeliveryType() { return deliveryType; }
    public void setDeliveryType(String deliveryType) { this.deliveryType = deliveryType; }

    public String getScheduledTime() { return scheduledTime; }
    public void setScheduledTime(String scheduledTime) { this.scheduledTime = scheduledTime; }

    @Override
    public String toString() {
        return deliveryType + " at " + scheduledTime;
    }
}