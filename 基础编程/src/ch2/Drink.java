package src.ch2;

public class Drink {
    private String brand;
    private  int price;

    public Drink(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s(%d)",brand,price);

    }
}
