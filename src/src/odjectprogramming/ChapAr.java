package odjectprogramming;

public class ChapAr {
    static class Product {
        String name; //상품명
        int price; // 상품가격
        int quantity; //상품수량

        public Product(String name, int price, int quantity) { //각각으로 사용하기 위한 this
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public void showInfo() { //상품 가격 수량을 출력하는 클래스
            System.out.println("상품명: " + name + ", 가격: " + price + ", 수량: " + quantity);
        }

        public int getInventoryValue() {
            return price * quantity;
        } //재고 가격 X 개수 = 총 금액
    }

    public static class ArrayEX {
        public static void main(String[] args) {
            Product[] products = new Product[3]; //배열 3개

            products[0] = new Product("사과", 1000, 5);
            products[1] = new Product("바나나", 500, 10);
            products[2] = new Product("포도", 3000, 2);

            for (int i = 0; i < products.length; i++) {
                products[i].showInfo();
                System.out.println("재고 총액: " + products[i].getInventoryValue());
            }
        }
    }
}