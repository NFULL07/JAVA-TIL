//월 번호 입력 프로그램
package chapter03;
import java.util.Scanner;

public class CheckInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //객체 생성
        int month; //변수선언
        do {
            System.out.print("올바른 월을 입력하시오 [1-12]: ");
            month = input.nextInt(); //변수 입력
        }   while (month < 1 || month > 12); //월의 입력이 올바르지 못하면 do반복
        System.out.println("사용자가 입력한 월은 " + month);
    }
}
