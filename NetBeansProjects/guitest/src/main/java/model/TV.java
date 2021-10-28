
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

    
    public TV(String brand, String model, int lifetime, int price, int length, int width, int height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
