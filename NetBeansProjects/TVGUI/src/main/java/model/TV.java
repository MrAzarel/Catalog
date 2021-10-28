
package model;

public class TV {
    private String brand;
    private String model;
    private int lifeTime;
    private double price;
    private Size size;

    public TV() {
        this.size = new Size();
    }

    public TV(String brand, String model, int lifeTime, double price, double length, double width, double height) {
        this.brand = brand;
        this.model = model;
        this.lifeTime = lifeTime;
        this.price = price;
        this.size = new Size(length, width, height);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TV{" + "brand=" + brand + ", model=" + model + ", lifeTime=" + lifeTime + ", price=" + price + ", size=" + size + '}';
    }
}
