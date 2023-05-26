package Homeworks.L1;

import java.util.Scanner;

public class DistanceCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество галлонов");
        double gallons = sc.nextDouble();
        double liters = gallons * 3.7854;
        System.out.println(gallons + "галлонам соответствует" + liters + "литров");
    }
}
