package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        System.out.println(getrandomNumber(50000));
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        Double r=-1.0;
        if(input.hasNextDouble()) {
             r = input.nextDouble();
            if(!(r>0.0)){
                System.out.println("You did not enter valid radius of circle");
            }else {
                //r = input.nextDouble();
                System.out.println("The area of a circle of radius "+ r +"is: " + 3.14*r*r);
            }
        }else{
            System.out.println("You did not enter valid radius of circle");
        }

        input.close();
/*
        while(!input.hasNextDouble()){
            input = new Scanner(System.in);
            System.out.print("Enter a valid radius: ");
        }
        r = input.nextDouble();
        System.out.println("The area of a circle of radius "+ r +"is: " + 3.14*r*r);*/
       System.out.println("Area of radius 5 is : " + Circle.getArea(5.0));
    }

    public static int getrandomNumber(int number) {
        int ranomnNo = (int) (Math.random() * number + 1);
        return ranomnNo;
    }
}
