package com.education_wired_.work3;

import java.util.Scanner;

public class Runner {

    public  void  run(){
        infoShapes(createShapesByScanner());
    }

    public  void infoShapes(Shape[] shapes){
        for (Shape shape: shapes){
            shape.draw();
        }
    }

    public Shape[] createShapesByScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.print("set count Shapes -> ");
        int count = sc.nextInt();
        Shape shapes[] = new Shape[count];

        while (count != 0){
            try {
                Scanner scshape = new Scanner(System.in);
                System.out.print("set shape String -> ");
                shapes[count-1] = Shape.parseShape(scshape.nextLine());
                count--;
            }catch (InvalidShapeStringException exp){
                System.out.println(exp.getMessage());
            }catch (ArrayIndexOutOfBoundsException exp){
                System.out.println("invalid parameter ");
            }catch (NumberFormatException exp){
                System.out.println("invalid number in parameter ");
            }
        }

        return shapes;
    }

}
