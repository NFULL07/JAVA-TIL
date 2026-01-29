package chapter03;
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        int max, min;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("두개의 정수를 입력하시오(큰수, 작은수): ");
        max = input.nextInt();
        min = input.nextInt();
        while (min != 0) { //min이 0이 되면 종료
            sum = max % min; //값 옮기기
            max = min;
            min = sum;
        }
        System.out.println("최대 공약수는 " + max); //몫이 없어짐
    }
}
