package odjectprogramming;

import java.util.Scanner;

public class Chap03ExampleConditionPractice02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;
        System.out.print("나이를 입력하세요: ");
        age = input.nextInt();
        System.out.print("You are in your age ");
        if (age>=60){
            System.out.println("sixties and over");
        } else if (age>=50) {
            System.out.println("fifties");
        } else if (age>=40) {
            System.out.println("forties");
        } else if (age>=30) {
            System.out.println("thirties");
        } else if (age>=20) {
            System.out.println("twenties");
        } else if (age>=13) {
            System.out.println("teenager");
        } else {
            System.out.println("kid");
        }
    }
}
