package model;

import java.util.Objects;

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
    
    public double getLength() {
        return this.size.getLength();
    }
    
    public double getWidth() {
        return this.size.getWidth();
    }
    
    public double getHeigth() {
        return this.size.getHeight();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.brand);
        hash = 17 * hash + Objects.hashCode(this.model);
        hash = 17 * hash + this.lifeTime;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.size);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TV other = (TV) obj;
        if (this.lifeTime != other.lifeTime) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        if (!Objects.equals(this.model, other.model)) {
            return false;
        }
        if (!Objects.equals(this.size, other.size)) {
            return false;
        }
        return true;
    }
    
    
       public String toString() {
        return  "Bran: " + brand +
                ", Model: " + model +
                ", LifeTime: " + lifeTime +
                ", Price: " + price;                               
    }
}