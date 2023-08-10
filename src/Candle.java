public class Candle {
    private String name;
    private double burnTime, price;
    private int quantity;

    public Candle(String name, double burnTime, double price) {
        this.name = name;
        this.burnTime = burnTime;
        this.price = price;
        this.quantity=0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBurnTime() {
        return burnTime;
    }

    public void setBurnTime(double burnTime) {
        this.burnTime = burnTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDollarBurnTime() {
        return (quantity*price)/burnTime;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
