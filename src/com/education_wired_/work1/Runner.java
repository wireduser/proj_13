package com.education_wired_.work1;

public class Runner {
    public  int divisionINT(int x, int y){
        return  x/y;
    }
    public  int divisionDouble(double x, double y){
        if (y == 0){
            throw  new ArithmeticException("/ by zero ");
        }
        return (int)(x/y);
    }
}
