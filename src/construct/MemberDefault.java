package construct;

public class MemberDefault {
    String name;

    /**
     * 생성자가 하나도 없으면 자동으로 만들어지는 기본 생성자 예시
     * 다만 생성자가 하나라도 있으면 기본 생성자는 만들어지지 않은다.
     */
    public MemberDefault() {
        System.out.println("생성자 호출");
    }
}
