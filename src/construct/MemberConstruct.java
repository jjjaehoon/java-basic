package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    /**
     * 생성자 메서드 오버로딩
     * 생성자 내부에서 this()로 자신의 생성자를 호출할 수 있다.
     */
    MemberConstruct(String name, int age) {
        this(name, age, 50);    //this()는 생성자 코드 첫 줄에만 작성할 수 있다.
    }

    /**
     * 생성자
     * 생성자 이름은 클래스 이름과 동일하고 반환 타입이 없다.
     * 인스턴스를 생성하고 즉시 호출된다.
     */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name= " + name + " age= " + age + " grade= " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
