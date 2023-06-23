package Homeworks.L4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter square side length: ");
        double side = sc.nextDouble();
        double area = sq.areaCalculator(side);
        System.out.print("Square area: " + area);
    }
}

class Square {
    double areaCalculator(double side){
        return side * side;
    }
}
