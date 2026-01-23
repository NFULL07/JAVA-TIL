// %연산자를 활용한 윤년계신기
package chapter02;

import java.time.Year;

public class LeapYear {
    static void main(String[] args) {

        int year = 2026;
        boolean isLeapYear;

        isLeapYear = (year % 4 == 0);
        System.out.println(isLeapYear);
    }
}
