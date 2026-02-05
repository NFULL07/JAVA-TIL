// Phone 클래스 정의
class Phone {
    String model; // 필드: 스마트폰 모델명
    int value;    // 필드: 가격 (단위: 만 원)

    // 메서드: 정보를 출력하는 기능
    void print() {
        System.out.println(value + "만 원짜리 " + model + " 스마트폰");
    }
}

// 메인 실행 클래스
public class PhoneDemo {
    public static void main(String[] args) {
        // 1. myPhone 객체 생성 및 값 대입
        Phone myPhone = new Phone(); 
        myPhone.model = "갤럭시 S8"; // 필드 값 대입
        myPhone.value = 100;
        myPhone.print();             // 메서드 호출

        // 2. yourPhone 객체 생성 및 값 대입
        Phone yourPhone = new Phone();
        yourPhone.model = "G6";
        yourPhone.value = 85;
        yourPhone.print();
    }
}
