//인사말 출력
package chapter03;
import java.util.Date;

public class Welcome {
    public static void main(String[] args) {
        Date date = new Date(); // Date 객체 생성
        int currentHours = date.getHours(); //getHours 호출

        System.out.println("현재시간은 "+ date);
        if (currentHours < 11){
            System.out.println("Good morning");
        } else if (currentHours < 15) {
            System.out.println("Good afternoon");
        } else if (currentHours < 20) {
            System.out.println("Good evening");
        } else {
            System.out.println("Good night");
        }
    }
}
