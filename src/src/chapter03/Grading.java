//성적에 따른 학점 결정
package chapter03;
import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        int score;
        Scanner input = new Scanner(System.in);

        System.out.print("성적을 입력하시오: ");
        score = input.nextInt();

        if(score >= 90)
            System.out.println("학점 A");
        else if (score >= 80) //else if 사용
            System.out.println("학점 B");
        else if (score >= 70)
            System.out.println("학점 C");
        else
        System.out.println("학점 F");

    }

}
