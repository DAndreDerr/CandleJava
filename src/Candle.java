public class Candle {
    private String name;
    private double burnTime, price;
    private int quantity;

    public Candle(String name, double burnTime, double price) {
        // Constructor to initialize the Candle object with the provided name, burn time, and price
        this.name = name;
        this.burnTime = burnTime;
        this.price = price;
        this.quantity = 0; // Set the initial quantity to 0
    }

    public String getName() {
        // Getter method to retrieve the name of the candle
        return name;
    }

    public void setName(String name) {
        // Setter method to update the name of the candle
        this.name = name;
    }

    public double getBurnTime() {
        // Getter method to retrieve the burn time of the candle
        return burnTime;
    }

    public void setBurnTime(double burnTime) {
        // Setter method to update the burn time of the candle
        this.burnTime = burnTime;
    }

    public double getPrice() {
        // Getter method to retrieve the price of the candle
        return price;
    }

    public void setPrice(double price) {
        // Setter method to update the price of the candle
        this.price = price;
    }

    public double getDollarBurnTime() {
        // Method to calculate and retrieve the dollar per burn time of the candle
        return (quantity * price) / burnTime;
    }

    public int getQuantity() {
        // Getter method to retrieve the quantity of the candle
        return quantity;
    }

    public void setQuantity(int quantity) {
        // Setter method to update the quantity of the candle
        this.quantity = quantity;
    }
}