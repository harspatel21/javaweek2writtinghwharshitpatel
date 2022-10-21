package javaweek2writtinghwharshitpatel;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */

public class Programme_6_AreaOfCircle {
    public static void main(String[] args) {
        //Scanner declaration for reading  input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius :");
        double radius = scanner.nextDouble();
        areaofcircle(radius);
        // closing the scanner object
        scanner.close();
    }

    public static void areaofcircle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circle is : " + area);
    }
}
