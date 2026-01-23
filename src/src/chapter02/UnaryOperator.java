package chapter02;

public class UnaryOperator {
    static void main(String[] args) {
        int x = 1;
        int y = 1;

        int nextx = ++x; //nextx는 2
        int nexty = y++; //nextx는 1
        System.out.println(nextx);
        System.out.println(nexty);
    }
}
