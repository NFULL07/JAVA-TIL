/* * [에러 연습] variable index might not have been initialized
 * 원인: 지역 변수 index를 초기화하지 않고 출력(System.out.println)하려 함.
 * 해결: int index = 0; 처럼 초기값을 주어야 함.

package chapter02;

public class VarInitTest {
    static void main(String[] args) {
        int index;

        index = index + 1;
        System.out.println("index : " + index);
    }
} */
