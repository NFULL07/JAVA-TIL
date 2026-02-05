package chapter04;

public class LocalVariableDemo {
    public static void main(String[] args) {
        int a = 0;
        double b;

        // System.out.print(b); 
        // 오류: 초기화되지 않은 지역 변수는 사용할 수 없습니다.

        // System.out.print(a + c);
        // 오류: c 변수가 아직 선언되지 않았기 때문에 사용할 수 없습니다.

        int c = 0;

        // public double d = 0.0;
        // 오류: 지역 변수에는 public과 같은 접근 제어자를 사용할 수 없습니다.

        for (int e = 0; e < 10; e++) {
            // int a = 1;
            // 오류: 3행에서 이미 선언된 변수 이름입니다. 
            // 블록이 달라도(중첩 블록 내부) 같은 이름으로 다시 선언할 수 없습니다.

            System.out.print(e);
        }
    }
}
        
