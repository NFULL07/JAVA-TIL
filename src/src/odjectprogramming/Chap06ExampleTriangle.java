package odjectprogramming;

public class Chap06ExampleTriangle {
    int base;
    int height;

    public Chap06ExampleTriangle() {
        this.base = 5;
        this.height = 5;
    }

    public Chap06ExampleTriangle(int length) {
        this.base = length;
        this.height = length;
        }

    public Chap06ExampleTriangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (this.base * this.height) / 2.0;
    }

    public static void main(String[] args) {
        Chap06ExampleTriangle num1 = new Chap06ExampleTriangle(); //1번: 5 고정
        System.out.println("1번의 넓이: " + num1.getArea());

        Chap06ExampleTriangle num2 = new Chap06ExampleTriangle(10); // 2. 입력 값과 같게 나옴
        System.out.println("2번의 넓이: " + num2.getArea());

        Chap06ExampleTriangle num3 = new Chap06ExampleTriangle(10, 5); //아무거나 두 개
        System.out.println("3번의 넓이: " + num3.getArea());
    }
}
