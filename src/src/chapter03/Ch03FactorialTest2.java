public class Ch03FactorialTest2 {
    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
    }

    static int factorial(int n) {
        // 개선된 switch 문을 연산식으로 활용
        return switch (n) {
            case 0, 1 -> 1;
            default -> n * factorial(n - 1); // 재귀 호출
        };
    }
}
