package model;


public class Size {
    private double length;
    private double width;
    private double height;
    private double diagonal;

    public Size() {
        
    }
    public Size(double length, double width, double height, double diagonal) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Size(double length, double width, double height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Size{" + "length=" + length + ", width=" + width + ", height=" + height + ", diagonal=" + diagonal + '}';
    }
}
