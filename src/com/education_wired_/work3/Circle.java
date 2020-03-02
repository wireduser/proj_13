package com.education_wired_.work3;

public class Circle extends Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = "+ radius;
    }

    public static Circle parseCircle(String args){
        String[] dimArgs = args.trim().split("\\s*[:,]\\s*");
        return new Circle(dimArgs[0],Integer.parseInt(dimArgs[1]));
    }

}
