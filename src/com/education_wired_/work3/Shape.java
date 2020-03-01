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
        String[] shapeArgs = strShape.trim().split("\\s*:\\s*");

        switch (shapeArgs[0].toUpperCase().trim()){
            case "CIRCLE":
                return Circle.parseCircle(strShape);
            case "TRIANGLE":
                return  Triangle.parseTriangle(strShape);
            case "RECTANGLE":
                return  Rectangle.parseRectangle(strShape);
            default:
                throw new InvalidShapeStringException("Error Shape name - \"" + shapeArgs[0].trim()+"\"");
        }
    }
}
