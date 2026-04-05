public class OrderManager {
    private String product;
    private int quantity;
    private double price;
    private int discount;
    private String places;

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) { 
        this.discount = discount;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double calculateTotal() {
        return quantity * price;
    }

    public int getDiscount() {
        return discount;
    }

    public double getTotalDiscount() {
        return (double) discount / 100;
    }

    public String getPlaces() {
        return places;
    }
}