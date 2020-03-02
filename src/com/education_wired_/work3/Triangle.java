package com.education_wired_.work3;

public class Triangle extends Shape {
    private int a;
    private int b;
    private  int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        return Math.sqrt((a + b + c)*(a + b - c)*(b + c - a)*(a + c - b))/4;
    }

    @Override
    public String toString() {
        return super.toString() +", a = " + a +", b = " + b +", c = " + c ;
    }

    public static Triangle parseTriangle(String args){
        String[] dimArgs = args.trim().split("\\s*[:,]\\s*");
        return new Triangle(dimArgs[0],Integer.parseInt(dimArgs[1]),Integer.parseInt(dimArgs[2]),Integer.parseInt(dimArgs[3]));
    }
}
