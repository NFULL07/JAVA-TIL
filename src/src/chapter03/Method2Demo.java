package chapter03;

public class Method2Demo {
    public static void main(String[] args) {
        System.out.println("합 (1~10) : " + sum(1, 10));
        System.out.println("합 (1~100) : " + sum(1, 100));
        System.out.println("합 (1~1000) : " + sum(1, 1000));
    }

    public static int sum(int i1, int i2) { //사용자 정의 메서드, 입력한 sum값 i1과 i2에 대입
        int sum = 0; //메서드의 본체로 재활용되는 코드다.
        for (int i = i1; i <= i2; i++)
            sum += i;

        return sum;
    }
}
