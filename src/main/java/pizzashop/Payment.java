package pizzashop;

public class Payment {

    // The payment method card or cash
    private String method;

    // Last 4 digits of the card
    private String cardLast4;

    // Total amount charged
    private double totalAmount;

    public Payment(String method, String cardLast4, double totalAmount) {
        this.method = method;
        this.cardLast4 = cardLast4;
        this.totalAmount = totalAmount;
    }

    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }

    public String getCardLast4() { return cardLast4; }
    public void setCardLast4(String cardLast4) { this.cardLast4 = cardLast4; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    @Override
    public String toString() {
        return method + " ending in " + cardLast4 + " | Total: $" + totalAmount;
    }
}