package odjectprogramming;

import java.util.Scanner;

public class MethodOverladingExample02 {
    public static double sum(double base, double height) {
        return (base * height / 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("base 값은?");
        double base = input.nextDouble();
        System.out.println("height 값은?");
        double height = input.nextDouble();
        System.out.println("삼각형넓이의 값은?: "+ sum(base, height));
    }
}
