public class ReturnDemo {
    public static void main(String[] args) {
        // 첫 번째 호출: 정상 범위 (0~100)
        printScore(99);
        
        // 두 번째 호출: 범위를 벗어남 (120)
        printScore(120);
    }

    public static void printScore(int score) {
        // 점수가 0보다 작거나 100보다 크면 오류 메시지를 출력하고 메서드 종료
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수 : " + score);
            return; // 여기서 메서드가 종료되어 아래의 코드는 실행되지 않습니다.
        }
        
        // 점수가 정상 범위일 때만 실행되는 코드
        System.out.println("점수 : " + score);
    }
}
