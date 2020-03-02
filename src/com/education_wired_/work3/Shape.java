package com.education_wired_.work3;



public abstract class Shape implements Drawable, Comparable, Cloneable{
    private String color ;
    public abstract double calcArea();

    public String getColor() {
        return color;
    }

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName()+ ": color = " + color;
    }

    @Override
    public void draw() {
        System.out.println(this + " -> area =  " + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        //return (int)(this.calcArea()-((Shape)o).calcArea());
        return Double.compare(this.calcArea(),((Shape)o).calcArea());

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Shape shape = (Shape)super.clone();
        shape.color = new String(this.color);
        return shape;
    }

    public static Shape parseShape(String strShape){

        int index = strShape.indexOf(":");
        String figure = strShape.substring(0,index).trim();
        String args = strShape.substring(index+1);
        Shape shape = null;
        switch (figure.toUpperCase()){
            case "CIRCLE":
                shape = Circle.parseCircle(args);
                break;
            case "TRIANGLE":
                shape =  Triangle.parseTriangle(args);
                break;
            case "RECTANGLE":
                shape =  Rectangle.parseRectangle(args);
                break;
            default:
                throw new InvalidShapeStringException("Error Shape name - \"" + figure+"\"");
        }
        return shape;
    }
}
