//final 키워드를 이용한 리터럴을 기호상수로 표현.
package chapter02;

public class Constant {
    static void main(String[] args) {
        final double KM_PER_MILE = 1.609344;
        double km;
        double mile = 60.0;
        km = KM_PER_MILE * mile;

        System.out.println("60마일은 " + km + "킬로미터입니다.");
    }
}
