package model;


public class Puple {
    private String fio;
    private int level;
    private double point;

    public Puple() {
    }

    public Puple(String fio, int level, double point) {
        this.fio = fio;
        this.level = level;
        this.point = point;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
    
    
}
