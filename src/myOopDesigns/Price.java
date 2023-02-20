package myOopDesigns;

public class Price {
    private int price;

    public Price(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("""
                ============================
                Your added price: %d
                """,price);
    }
}
