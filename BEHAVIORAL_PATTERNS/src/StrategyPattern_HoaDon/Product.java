package StrategyPattern_HoaDon;

public class Product {
    private String id;
    private String name;
    private long price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Product(String _id, String _name, long _price) {
        this.id = _id;
        this.name = _name;
        this.price = _price;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.id + " - " + this.name + " - " + this.price;
    }
}
