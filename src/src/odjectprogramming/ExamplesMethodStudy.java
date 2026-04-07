package odjectprogramming;

import java.util.Scanner;

public class ExamplesMethodStudy {
    public static double max(double x, double y) {
        double result;
        if (x > y) result = x;
        else  result = y;
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two real numbers: ");

        double a, b;
        a = input.nextDouble();
        b = input.nextDouble();
        
        double num = max(a, b);
        System.out.println("The large number is " + num);
    }
}
