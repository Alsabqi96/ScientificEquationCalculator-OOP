package Entities;

public class CircleData {
    private double radius;
    private BaseData baseData;

    //This is a Constructor
    public CircleData(double radius, BaseData baseData) {
        this.radius = radius;
        this.baseData = baseData;
    }

    //This is a Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public BaseData getBaseData() {
        return baseData;
    }

    public void setBaseData(BaseData baseData) {
        this.baseData = baseData;
    }
}



