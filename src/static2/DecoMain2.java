package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        //static 메서드 사용 후 코드 예제
        String s = "hello java";
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
