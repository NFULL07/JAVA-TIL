package chapter03;

public class Switch3Demo {
    public static void main(String[] args) {
        whoIsIt ("호랑이");
        whoIsIt ("참새");
        whoIsIt ("고등어");
        whoIsIt ("곰팡이");
    }
    static void whoIsIt(String bio) {
        // switch 자체가 값을 반환하여 kind에 바로 저장합니다.
        String kind = switch (bio) {
            case "호랑이", "사자" -> "포유류";
            case "독수리", "참새" -> "조류";
            case "고등어", "연어" -> "어류";
            default -> {
                System.out.print("어이쿠! ");
                yield "..."; // yield는 값을 반환한다는 뜻입니다.
            }
        };
        System.out.printf("%s는 %s이다.\n", bio, kind);
    }
}
