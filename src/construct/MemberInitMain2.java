package construct;

public class MemberInitMain2 {

    public static void main(String[] args) {
        /**
         * 객체를 생성하면 name, age 같은 변수의 초기값을 설정해야한다.
         * 이 코드는 초기값을 설정하는 부분이 반복된다.
         */
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }

    /**
     * 메서드를 사용해 반복을 제거했지만 속성과 기능이 분리되어 있다.
     */
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
