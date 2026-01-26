//입력한 두 개의 숫자의 합 출력
package chapter02;
import java.util.Scanner; //Scanner 클래스 포함

public class Add2 {
//메인 메소드부터 실행 시작됨
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x; //첫 번째 숫자 저장
        int y; // 두 번째 숫자 저장
        int sum; // 두 수의 합을 저장

        System.out.print("첫번째 숫자를 입력하시오: ");
        x = input.nextInt();

        System.out.print("두번째 숫자를 입력하시오: ");
        y = input.nextInt();

        sum = x + y ;

        System.out.println(sum); //출력

    }
}
