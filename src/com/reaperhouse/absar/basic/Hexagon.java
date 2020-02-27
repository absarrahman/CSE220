package com.reaperhouse.absar.basic;

public class Hexagon extends GeometricObject implements Comparable  {
    private double side;

    public Hexagon(double side){
        this.side=side;
    }

    @Override
    public double findArea() {
        double area=((3*Math.sqrt(3))/2)*(side*side);
        return area;
    }

    @Override
    public double findPerimeter() {
        return 6*side;
    }

    @Override
    public int compareTo(Object o) {
        Hexagon compareVal= (Hexagon) o;
        /**
         * returns 0 if area is equal
         * returns 1 if current object area is greater
         * else return -1
         *
         */
        if(this.findArea()==compareVal.findArea()){
            return 0;
        } else if(this.findArea()>compareVal.findArea()){
            return 1;
        }
        return -1;
    }
}
