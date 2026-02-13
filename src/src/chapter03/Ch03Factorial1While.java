package chapter03;import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ch03Factorial1While {
    public static void main(String[] args) {
        int result;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("팩토리얼 값을 구할 정수: ");
        n = in.nextInt();

        result = 1;
        while (n > 0) {
            result = result * n;
            n--;
        }

        System.out.println(result);
    }

}

