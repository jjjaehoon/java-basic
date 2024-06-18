package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        /**
         * 스택 구조를 알아보는 코드
         *
         * Ctrl + W 한번 누르면 단어 하나 드래그
         * 누를 때마다 옆으로 점점 드래그 함
         *
         * Ctrl + D 커서 있는 한줄 아래에 복사
         */
        System.out.println("main start");
        method1(10);

        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);

        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
