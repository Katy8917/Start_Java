package Homeworks.L5;

import java.util.Scanner;
public class Retirement {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year (M или F): ");
        char gender = scanner.next().charAt(0);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Human human = new Human(gender, age);

        int retiredAgeDiff = human.retiredAgeDiff();

        if (retiredAgeDiff > 0) {
            System.out.println("Years left until retirement" +
                    retiredAgeDiff + " years");
        } else if (retiredAgeDiff < 0) {
            System.out.println("You are already retired " + (retiredAgeDiff * (-1))
                    + " years, congratulations!");
        } else {
            System.out.println("You are retiring this year!");
        }
    }
}

class Human {
    private int age;
    private int retiredAge;

    public Human(char gender, int age) throws IllegalArgumentException {
        switch (gender) {
            case 'M':
                retiredAge = 70;
                break;
            case 'F':
                retiredAge = 65;
                break;
            default:
                throw new IllegalArgumentException("Gender is incorrect!");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Years must be non-negative!");
        }
        this.age = age;
    }

    int retiredAgeDiff() {
        return retiredAge - age;
    }

}
