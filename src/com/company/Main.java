package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1, side2, side3;

        System.out.println("Please input the length of the first side of the triangle :");
        side1 = scanner.nextInt();

        System.out.println("Please input the length of the second side of the triangle :");
        side2 = scanner.nextInt();

        System.out.println("Please input the length of the third side of the triangle :");
        side3 = scanner.nextInt();


        int perimeter = side1 + side2 + side3;   //Çevreyi buluyoruz Çevre = 2u
        int u = perimeter / 2;
        double area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));

        System.out.println("Triangel's perimeter is: " + perimeter);
        System.out.println("Triangel's area is: " + area);
    }
}
