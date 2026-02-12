package chapter03;

import java.util.Scanner;

public class Ch03Factorial1 {
    public static void main(String[] args) {
        int result = 1; //!의 결과값 (곱셈 누적을 위해 1로 초기화)
        int n; //입력 받는 정수 저장
        int i;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (i = 1; i <= n; i++)
            result = result * i;
    
        System.out.println(result);
    }
}
