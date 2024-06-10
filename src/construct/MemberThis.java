package construct;

public class MemberThis {
    String nameField;

    /**
     * this는 생략 가능. 변수를 찾을 때 가까운 지역변수를 먼저 찾는다.
     */
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
