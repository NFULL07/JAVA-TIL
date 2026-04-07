package odjectprogramming;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        String city;
        String MBTI;
                //이름 나이 거주 도시 MBTI를 입력받아서 출력
        System.out.println("Please enter name, age, city, MBTI information with space");

        name = input.next();    // 문자열 입력
        age = input.nextInt();  // 정수형 입력
        city = input.next();    // 문자열 입력
        MBTI = input.next();    // 문자열 입력

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("MBTI: " + MBTI);

    }
}
