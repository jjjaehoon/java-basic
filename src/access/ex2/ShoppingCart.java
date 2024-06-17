package access.ex2;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }

        this.items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalPrice());
            total += items[i].getTotalPrice();
        }

        System.out.println("전체 가격 합: " + total);
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    /**
     * 전체 가격 합 정답 메서드
     * 만약 전체 가격이 필요한 로직이 더 있다면 이 메서드를 호출하면 됨
     */
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }
}
