package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    /**
     * this.name이 아닌 그냥 name으로 하면
     * 매개변수의 name이 코드 안쪽이기 때문에 우선순위를 가진다.
     *
     * 매개변수의 이름과 멤버 변수의 이름이 같을 경우 this로 명확하게 구분해야 한다.
     * this는 인스턴스 자신을 가리킨다.
     */

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
